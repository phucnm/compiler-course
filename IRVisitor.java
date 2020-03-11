import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class IRVisitor implements Visitor {

    private Environment<String, TempVar> variableEnv = new Environment<>();
    private Environment<String, FunctionDeclaration> functionEnv = new Environment<>();
    TempAllocator allocator;
    List<IRInstruction> instList;
    IRProgram program;
    Integer labelCount = 0;
    
    @Override
    public TempVar visit(Program p) throws SemanticException {
        program = new IRProgram(p);
        int funcCount = p.functions.size();

        for (int i = 0; i < funcCount; i++) {
            Function f = p.getFunction(i);
            functionEnv.add(f.decl.id.name, f.decl);
        }

        for (int i = 0; i < funcCount; i++)
        {
            Function f = p.getFunction(i);
            f.accept(this);
        }

        return null;
    }

    @Override
    public TempVar visit(Function f) throws SemanticException {
        allocator = new TempAllocator();
        instList = new ArrayList<IRInstruction>();
        labelCount = 0;
        variableEnv.beginScope();
        f.decl.accept(this);
        f.body.accept(this);
        variableEnv.endScope();
        IRFunction func = new IRFunction(f, instList, allocator);
        program.addFunction(func);
        return null;
    }

    @Override
    public TempVar visit(FunctionDeclaration d) throws SemanticException {
        if (d.params != null) {
            d.params.accept(this);
        }
        return null;
    }

    @Override
    public TempVar visit(FormalParameterList l) throws SemanticException {
        int listSize = l.getFormalParameterCount();
        for (int i=0; i < listSize; i++)
        {
            FormalParameter p = l.getFormalParameter(i);
            p.accept(this);
        }
        return null;
    }

    @Override
    public TempVar visit(FormalParameter p) throws SemanticException {
        TempVar t = allocator.allocate(p.type, p.id.name, null);
        variableEnv.add(p.id.name, t);
        return t;
    }

    @Override
    public TempVar visit(FunctionBody f) throws SemanticException {
        for (int i=0; i< f.getVariableDeclarationCount() ; i++) {
            VariableDeclaration v = f.getVariableDeclaration(i);
            v.accept(this);
        }
        for (int i=0; i< f.getStatementCount() ; i++)
        {
            Statement s = f.getStatement(i);
            s.accept(this);
        }
        return null;
    }

    @Override
    public TempVar visit(VariableDeclaration v) throws SemanticException {
        TempVar t = allocator.allocate(v.type, v.id.name, null);
        variableEnv.add(v.id.name, t);
        return null;
    }

    @Override
    public TempVar visit(Block b) throws SemanticException {
        for (int i=0; i< b.getStatementCount(); i++)
        {
            Statement s = b.getStatement(i);
            s.accept(this);
        }
        return null;
    }

    @Override
    public TempVar visit(WhileStatement w) throws SemanticException {
        TempVar tmp = (TempVar)w.expr.accept(this);
        w.block.accept(this);
        return tmp;
    }

    @Override
    public TempVar visit(IfStatement i) throws SemanticException {
        TempVar tmp = (TempVar)i.e.accept(this);
        IRNegation neg = new IRNegation(tmp);
        instList.add(neg);
        int elseBlockLbNumber = labelCount;
        IRIfInstruction ifIr = new IRIfInstruction(tmp, elseBlockLbNumber);
        instList.add(ifIr);

        i.ifBlock.accept(this);
        int ifBlockLbNumber = i.elseBlock != null ? labelCount + 1 : labelCount;
        IRJump ifJump = new IRJump(ifBlockLbNumber);
        instList.add(ifJump);
        
        if (i.elseBlock != null) {
            labelCount++;
            IRLabel elseLbIr = new IRLabel(elseBlockLbNumber);
            instList.add(elseLbIr);
            i.elseBlock.accept(this);
        }
        IRLabel lb = new IRLabel(labelCount);
        instList.add(lb);

        return tmp;
    }

    @Override
    public TempVar visit(PrintStatement p) throws SemanticException {
        TempVar t = (TempVar)p.e.accept(this);
        IRPrintInstruction ir = new IRPrintInstruction(t, false);
        instList.add(ir);
        return null;
    }

    @Override
    public TempVar visit(PrintLnStatement p) throws SemanticException {
        TempVar t = (TempVar)p.e.accept(this);
        IRPrintInstruction ir = new IRPrintInstruction(t, true);
        instList.add(ir);
        return null;
    }

    @Override
    public TempVar visit(AssignmentStatement a) throws SemanticException {
        TempVar var = (TempVar)a.id.accept(this);
        TempVar exprType = (TempVar)a.e.accept(this);
        IRAssignInstruction ir = create_assignment_IR(var, exprType);
        instList.add(ir);
        return null;
    }

    @Override
    public TempVar visit(ArrayAssignment a) throws SemanticException {
        Type arrayType = ((ArrayType)a.id.accept(this)).type;
        Type indexType = (Type)a.e1.accept(this);
        Type exprType = (Type)a.e2.accept(this);
        if (!(indexType instanceof IntegerType)) {
            throw new SemanticException("Line [%d, %d]: An array index expression must have type of int",
                indexType.line,
                indexType.pos
            );
        }
        if (!(exprType.isSubType(arrayType))) {
            throw new SemanticException("Line [%d, %d]: The type %s of an expression used in an array element assignment must be a subtype of the array type %s",
                exprType.line,
                exprType.pos,
                exprType,
                arrayType
            );
        }
        return null;
    }

    @Override
    public TempVar visit(ExpressionStatement e) throws SemanticException {
        return (TempVar)e.e.accept(this);
    }

    @Override
    public TempVar visit(ReturnStatement r) throws SemanticException {
        if (r.e != null) {
            TempVar t = (TempVar)r.e.accept(this);
            IRReturnInstruction ir = new IRReturnInstruction(t);
            instList.add(ir);
        } else {
            instList.add(new IRReturnInstruction(null));
        }
        return null;
    }

    @Override
    public TempVar visit(EmptyStatement s) throws SemanticException {
        return null;
    }

    @Override
    public TempVar visit(PlusExpression p) throws SemanticException {
        TempVar lhs = (TempVar)p.e1.accept(this);
        TempVar rhs = (TempVar)p.e2.accept(this);
        TempVar t = allocator.allocate(lhs.type, "LOCAL", null);
        IRBinaryOperation ir = new IRBinaryOperation(t, lhs, rhs, "+");
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(SubtractExpression p) throws SemanticException {
        TempVar lhs = (TempVar)p.e1.accept(this);
        TempVar rhs = (TempVar)p.e2.accept(this);
        TempVar t = allocator.allocate(lhs.type, "LOCAL", null);
        IRBinaryOperation ir = new IRBinaryOperation(t, lhs, rhs, "-");
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(MultExpression m) throws SemanticException {
        TempVar lhs = (TempVar)m.e1.accept(this);
        TempVar rhs = (TempVar)m.e2.accept(this);
        TempVar t = allocator.allocate(lhs.type, "LOCAL", null);
        IRBinaryOperation ir = new IRBinaryOperation(t, lhs, rhs, "*");
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(EqualityExpression e) throws SemanticException {
        TempVar lhs = (TempVar)e.e1.accept(this);
        TempVar rhs = (TempVar)e.e2.accept(this);
        TempVar t = allocator.allocate(lhs.type, "LOCAL", null);
        IRBinaryOperation ir = new IRBinaryOperation(t, lhs, rhs, "==");
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(LessThanExpression l) throws SemanticException {
        TempVar lhs = (TempVar)l.e1.accept(this);
        TempVar rhs = (TempVar)l.e2.accept(this);
        TempVar t = allocator.allocate(lhs.type, "LOCAL", null);
        IRBinaryOperation ir = new IRBinaryOperation(t, lhs, rhs, "<");
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(ArrayReference a) throws SemanticException {
        Type indexType = (Type)a.e.accept(this);
        if (!(indexType instanceof IntegerType)) {
            throw new SemanticException("Line [%d, %d]: An array index expression must have type of int",
                indexType.line,
                indexType.pos
            );
        }
        return null;
    }

    @Override
    public TempVar visit(FunctionCall f) throws SemanticException {
        if (f.exprList != null) {
            f.exprList.accept(this);
        }
        FunctionDeclaration decl = functionEnv.lookup(f.id.id.name);
        if (decl == null) {
            return null;
        }
        if (decl.params != null) {
            int defParamCount = decl.params.getFormalParameterCount();
            int invocationParamCount = f.exprList.getExpressionCount();
            if (defParamCount != invocationParamCount) {
                // 3.2.3 a
                throw new SemanticException("Line [%d, %d]: The number of arguments in the invocation must match the number of parameters %d in the function %s",
                    f.id.id.line,
                    f.id.id.pos,
                    defParamCount,
                    f.id.id.name
                );
            }
            for (int i = 0; i < defParamCount; i++) {
                Type defType = decl.params.getFormalParameter(i).type;
                Type invoType = (Type)f.exprList.getExpression(i).accept(this);
                if (!(invoType.isSubType(defType))) {
                    // 3.2.3 b
                    throw new SemanticException("Line [%d, %d]: Type of arguments must be convetible to type of declared parameters",
                        invoType.line,
                        invoType.pos
                    );
                }
            }
        }
        
        return null;
    }

    @Override
    public TempVar visit(IdentifierValue iv) throws SemanticException {
        TempVar tmp = variableEnv.lookupInScope(iv.id.name);
        return tmp;
    }

    @Override
    public TempVar visit(IntegerLiteral il) throws SemanticException {
        TempVar t = allocator.allocate(new IntegerType(), "LOCAL", null);
        IRConstantAssign ir = create_assignment_IR(t, new Value(il.val)); 
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(FloatLiteral fl) throws SemanticException {
        TempVar t = allocator.allocate(new FloatType(), "LOCAL", null);
        IRConstantAssign ir = create_assignment_IR(t, new Value(fl.val)); 
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(StringLiteral sl) throws SemanticException {
        TempVar t = allocator.allocate(new StringType(), "LOCAL", null);
        IRConstantAssign ir = create_assignment_IR(t, new Value(sl.val)); 
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(CharacterLiteral cl) throws SemanticException {
        TempVar t = allocator.allocate(new CharType(), "LOCAL", null);
        IRConstantAssign ir = create_assignment_IR(t, new Value(cl.val)); 
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(BooleanLiteral bl) throws SemanticException {
        TempVar t = allocator.allocate(new BooleanType(), "LOCAL", null);
        IRConstantAssign ir = create_assignment_IR(t, new Value(bl.val)); 
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(ParenExpression p) throws SemanticException {
        return (TempVar)p.e.accept(this);
    }

    @Override
    public TempVar visit(ExpressionList l) throws SemanticException {
        int listSize = l.getExpressionCount();
        for (int i=0; i < listSize; i++)
        {
            Expression e = l.getExpression(i);
            e.accept(this);
        }
        return null;
    }

    @Override
    public TempVar visit(IntegerType type) throws SemanticException {
        return null;
    }

    @Override
    public TempVar visit(FloatType type) throws SemanticException {
        return null;
    }

    @Override
    public TempVar visit(StringType type) throws SemanticException {
        return null;
    }

    @Override
    public TempVar visit(CharType type) throws SemanticException {
        return null;
    }

    @Override
    public TempVar visit(VoidType type) throws SemanticException {
        return null;
    }

    @Override
    public TempVar visit(ArrayType type) throws SemanticException {
        return null;
    }

    @Override
    public TempVar visit(BooleanType type) throws SemanticException {
        return null;
    }

    @Override
    public TempVar visit(Identifier id) throws SemanticException {
        return null;
    }

    private IRConstantAssign create_assignment_IR(TempVar t, Value value) {
        return new IRConstantAssign(t, value);
    }

    private IRAssignInstruction create_assignment_IR(TempVar lhs, TempVar rhs) {
        return new IRAssignInstruction(lhs, rhs);
    }
}
