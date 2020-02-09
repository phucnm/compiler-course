import java.util.HashMap;
import java.util.Map;

public class TypeCheckVisitor implements Visitor {

    private Environment<String, Type> variableEnv = new Environment<>();
    private Environment<String, FunctionDeclaration> functionEnv = new Environment<>();
    private static String mainFunctionName = "main";
    
    @Override
    public Type visit(Program p) throws SemanticException {
        boolean mainChecked = false;
        Function mainFunc = null;
        Map<String, Function> funcMap = new HashMap<String, Function>(); 
        int funcCount = p.getFunctionCount();
        
        if (funcCount < 1) {
            throw new SemanticException("A program must contain at least one function");
        }

        for (int i = 0; i < funcCount; i++) {
            Function f = p.getFunction(i);
            functionEnv.add(f.decl.id.name, f.decl);
        }

        for (int i = 0; i < funcCount; i++)
        {
            Function f = p.getFunction(i);
            String funcSig = f.functionNameSignature();
            if (funcMap.get(funcSig) != null) {
                // 2.1.3
                throw new SemanticException("There are two functions have the same name: " + f.decl.id.name);
            } else {
                funcMap.put(funcSig, f);
            }
            if (f.decl.id.name.equals(TypeCheckVisitor.mainFunctionName)) {
                mainChecked = true;
                mainFunc = f;
            }
            f.accept(this);
        }
        // 2.1.2
        if (mainChecked == false) {
            throw new SemanticException("There must be at least one function main");
        }
        // 2.1.2
        if (mainFunc == null) {
            throw new SemanticException("There must be at least one function main");
        }
        // 2.1.2 a
        if (mainFunc.decl.params != null && mainFunc.decl.params.getFormalParameterCount() != 0) {
            throw new SemanticException("Main function must take no parameters");
        }
        // 2.1.2 b
        if (!(mainFunc.decl.type instanceof VoidType)) {
            throw new SemanticException("Main function must have a return type of `void`");
        }
        return null;
    }

    @Override
    public Type visit(Function f) throws SemanticException {
        Type returnType = (Type)f.decl.accept(this);
        f.body.containingFunction = f;
        f.body.accept(this);
        return returnType;
    }

    @Override
    public Type visit(FunctionDeclaration d) throws SemanticException {
        if (d.params != null) {
            d.params.accept(this);
        }
        return d.type;
    }

    @Override
    public Type visit(FormalParameterList l) throws SemanticException {
        Map<String, FormalParameter> paramMap = new HashMap<String, FormalParameter>();
        variableEnv.beginScope();
        int listSize = l.getFormalParameterCount();

        for (int i=0; i < listSize; i++)
        {
            FormalParameter p = l.getFormalParameter(i);
            // 2.2.1
            if (paramMap.get(p.id.name) != null) {
                throw new SemanticException("No two parameters of a function may have the same name");
            } else {
                paramMap.put(p.id.name, p);
            }
            // 2.2.3
            if (p.type instanceof VoidType) {
                throw new SemanticException("No parameter may have a type of void");
            }
            p.accept(this);
        }
        variableEnv.endScope();
        return null;
    }

    @Override
    public Type visit(FormalParameter p) throws SemanticException {
        variableEnv.add(p.id.name, p.type);
        return p.type;
    }

    @Override
    public Type visit(FunctionBody f) throws SemanticException {
        Map<String, VariableDeclaration> localVarMap = new HashMap<String, VariableDeclaration>();
        variableEnv.beginScope();
        for (int i=0; i< f.getVariableDeclarationCount() ; i++) {
            VariableDeclaration v = f.getVariableDeclaration(i);
            // 2.2.2
            if (localVarMap.get(v.id.name) != null) {
                throw new SemanticException("No two local variables declared in a function may have the same name");
            } else {
                localVarMap.put(v.id.name, v);
            }
            // 2.2.4
            if (v.type instanceof VoidType) {
                throw new SemanticException("No local variable may have a type of void");
            }
            v.accept(this);
        }
        variableEnv.endScope();
        for (int i=0; i< f.getStatementCount() ; i++)
        {
            Statement s = f.getStatement(i);
            if (s instanceof ReturnStatement) {
                Type retType = (Type)s.accept(this);
                if (!(retType.isSubType(f.containingFunction.decl.type))) {
                    throw new SemanticException("The type of an expression used in a return statement must be a subtype of the return type of the containing function");
                }
            } else {
                s.accept(this);
            }
        }
        return null;
    }

    @Override
    public Type visit(VariableDeclaration v) throws SemanticException {
        variableEnv.add(v.id.name, v.type);
        return v.type;
    }

    @Override
    public Type visit(Block b) throws SemanticException {
        variableEnv.beginScope();
        for (int i=0; i< b.getStatementCount(); i++)
        {
            Statement s = b.getStatement(i);
            s.accept(this);
        }
        variableEnv.beginScope();
        return null;
    }

    @Override
    public Type visit(WhileStatement w) throws SemanticException {
        Type exprType = (Type)w.expr.accept(this);
        // 3.1.2
        if (!(exprType instanceof BooleanType)) {
            throw new SemanticException("An expression used as an while-statement condition must have type boolean");
        }
        w.block.accept(this);
        return null;
    }

    @Override
    public Type visit(IfStatement i) throws SemanticException {
        Type exprType = (Type)i.e.accept(this);
        // 3.1.1
        if (!(exprType instanceof BooleanType)) {
            throw new SemanticException("An expression used as an if-statement condition must have type boolean");
        }
        i.ifBlock.accept(this);
        if (i.elseBlock != null) {
            i.elseBlock.accept(this);
        }
        return null;
    }

    @Override
    public Type visit(PrintStatement p) throws SemanticException {
        Type t = (Type)p.e.accept(this);
        // 3.1.3
        if (t instanceof VoidType) {
            throw new SemanticException("An expression used in a print-statement must have type in {int, float, char, string, boolean}");
        }
        return null;
    }

    @Override
    public Type visit(PrintLnStatement p) throws SemanticException {
        Type t = (Type)p.e.accept(this);
        // 3.1.4
        if (t instanceof VoidType) {
            throw new SemanticException("An expression used in a println-statement must have type in {int, float, char, string, boolean}");
        }
        return null;
    }

    @Override
    public Type visit(AssignmentStatement a) throws SemanticException {
        Type varType = (Type)a.id.accept(this);
        Type exprType = (Type)a.e.accept(this);
        if (!(exprType.isSubType(varType))) {
            throw new SemanticException("The type of an expression used in an assignment statment must be a subtype of the containing function");
        }
        return null;
    }

    @Override
    public Type visit(ArrayAssignment a) throws SemanticException {
        a.id.accept(this);
        a.e1.accept(this);
        a.e2.accept(this);
        return null;
    }

    @Override
    public Type visit(ExpressionStatement e) throws SemanticException {
        e.e.accept(this);
        return null;
    }

    @Override
    public Type visit(ReturnStatement r) throws SemanticException {
        if (r.e != null) {
            Type retType = (Type)r.e.accept(this);
            return retType;
        }
        return new VoidType();
    }

    @Override
    public Type visit(EmptyStatement s) throws SemanticException {
        return null;
    }

    @Override
    public Type visit(PlusExpression p) throws SemanticException {
        Type typeA = (Type)p.e1.accept(this);
        Type typeB = (Type)p.e2.accept(this);
        if (typeA instanceof BooleanType || typeA instanceof VoidType) {
            throw new SemanticException("Binary operator '+' cannot be applied to operands of type " + typeA.toString());
        }
        if (typeB instanceof BooleanType || typeB instanceof VoidType) {
            throw new SemanticException("Binary operator '+' cannot be applied to operands of type " + typeB.toString());
        }
        if (!typeA.equals(typeB)) {
            throw new SemanticException("Binary operator '+' cannot be applied to operands of type " + typeA.toString() + "and " + typeB.toString());
        }
        return typeA;
    }
    @Override
    public Type visit(SubtractExpression p) throws SemanticException {
        Type typeA = (Type)p.e1.accept(this);
        Type typeB = (Type)p.e2.accept(this);
        if (typeA instanceof StringType || 
            typeA instanceof BooleanType || 
            typeA instanceof VoidType) {
            throw new SemanticException("Binary operator '-' cannot be applied to operands of type " + typeA.toString());
        }
        if (typeB instanceof StringType ||
            typeB instanceof BooleanType || 
            typeB instanceof VoidType) {
            throw new SemanticException("Binary operator '-' cannot be applied to operands of type " + typeB.toString());
        }
        if (!typeA.equals(typeB)) {
            throw new SemanticException("Binary operator '-' cannot be applied to operands of type " + typeA.toString() + "and " + typeB.toString());
        }
        return typeA;
    }

    @Override
    public Type visit(MultExpression m) throws SemanticException {
        Type typeA = (Type)m.e1.accept(this);
        Type typeB = (Type)m.e2.accept(this);
        if (!(typeA instanceof IntegerType) && 
            !(typeA instanceof FloatType)) {
            throw new SemanticException("Binary operator '*' cannot be applied to operands of type " + typeA.toString());
        }
        if (!(typeB instanceof IntegerType) && 
            !(typeB instanceof FloatType)) {
            throw new SemanticException("Binary operator '*' cannot be applied to operands of type " + typeB.toString());
        }
        if (!typeA.equals(typeB)) {
            throw new SemanticException("Binary operator '*' cannot be applied to operands of type " + typeA.toString() + "and " + typeB.toString());
        }
        return typeA;
    }

    @Override
    public Type visit(EqualityExpression e) throws SemanticException {
        Type typeA = (Type)e.e1.accept(this);
        Type typeB = (Type)e.e2.accept(this);
        if (typeA instanceof VoidType || typeB instanceof VoidType) {
            throw new SemanticException("Binary operator '==' cannot be applied to operands of type " + typeA.toString());
        }
        if (!typeA.equals(typeB)) {
            throw new SemanticException("Binary operator '==' cannot be applied to operands of type " + typeA.toString() + "and " + typeB.toString());
        }
        return new BooleanType();
    }

    @Override
    public Type visit(LessThanExpression l) throws SemanticException {
        Type typeA = (Type)l.e1.accept(this);
        Type typeB = (Type)l.e2.accept(this);
        if (!typeA.equals(typeB)) {
            return null;
        }
        return new BooleanType();
    }

    @Override
    public Type visit(ArrayReference a) throws SemanticException {
        Type indexType = (Type)a.e.accept(this);
        if (indexType instanceof IntegerType) {
            return indexType;
        }
        return null;
    }

    @Override
    public Type visit(FunctionCall f) throws SemanticException {
        if (f.exprList != null) {
            f.exprList.accept(this);
        }
        FunctionDeclaration decl = functionEnv.lookup(f.id.id.name);
        if (decl == null) {
            return null;
        }
        return decl.type;
    }

    @Override
    public Type visit(IdentifierValue iv) throws SemanticException {
        Type varType = variableEnv.lookup(iv.id.name);
        if (varType == null) {
            throw new SemanticException("Each local variable must be defined before being used.");
        }
        return varType;
    }

    @Override
    public Type visit(IntegerLiteral il) throws SemanticException {
        return new IntegerType();
    }

    @Override
    public Type visit(FloatLiteral fl) throws SemanticException {
        return new FloatType();
    }

    @Override
    public Type visit(StringLiteral sl) throws SemanticException {
        return new StringType();
    }

    @Override
    public Type visit(CharacterLiteral cl) throws SemanticException {
        return new CharType();
    }

    @Override
    public Type visit(BooleanLiteral bl) throws SemanticException {
        return new BooleanType();
    }

    @Override
    public Type visit(ParenExpression p) throws SemanticException {
        return null;
    }

    @Override
    public Type visit(ExpressionList l) throws SemanticException {
        int listSize = l.getExpressionCount();
        for (int i=0; i < listSize; i++)
        {
            Expression e = l.getExpression(i);
            e.accept(this);
        }
        return null;
    }

    @Override
    public Type visit(IntegerType type) throws SemanticException {
        return type;
    }

    @Override
    public Type visit(FloatType type) throws SemanticException {
        return type;
    }

    @Override
    public Type visit(StringType type) throws SemanticException {
        return type;
    }

    @Override
    public Type visit(CharType type) throws SemanticException {
        return type;
    }

    @Override
    public Type visit(VoidType type) throws SemanticException {
        return type;
    }

    @Override
    public Type visit(ArrayType type) throws SemanticException {
        return type;
    }

    @Override
    public Type visit(BooleanType type) throws SemanticException {
        return type;
    }

    @Override
    public Type visit(Identifier id) throws SemanticException {
        return null;
    }
}