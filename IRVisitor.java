import java.util.List;
import java.util.ArrayList;

public class IRVisitor implements Visitor {

    private Environment<String, TempVar> variableEnv = new Environment<>();
    private Environment<String, Function> functionEnv = new Environment<>();
    TempAllocator allocator;
    List<IRInstruction> instList;
    IRProgram program;
    Integer labelCount = 0;
    String programName = "";
    Integer cmp_labelCount = 0;
    
    @Override
    public TempVar visit(Program p) throws SemanticException {
        program = new IRProgram(p, programName);
        int funcCount = p.functions.size();

        for (int i = 0; i < funcCount; i++) {
            Function f = p.getFunction(i);
            functionEnv.add(f.decl.id.name, f);
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
        if (t.type instanceof ArrayType) {
            IRArrayCreation ir = new IRArrayCreation(t);
            instList.add(ir);
        }
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
        int whileBlockLbNumb = labelCount++;
        IRLabel lb = new IRLabel(whileBlockLbNumb);
        instList.add(lb);

        TempVar tmp = (TempVar)w.expr.accept(this);
        TempVar condTemp = new TempVar(tmp.type, tmp.name, tmp.number);
        if (variableEnv.lookupInScope(tmp.name) != null) {
            condTemp = allocator.allocate(new BooleanType(), "LOCAL", null);
        }
        IRNegation neg = new IRNegation(condTemp, tmp);
        instList.add(neg);
        
        IRIfInstruction ifIr = new IRIfInstruction(condTemp, labelCount);
        instList.add(ifIr);
        w.block.accept(this);

        IRJump jump = new IRJump(whileBlockLbNumb);
        instList.add(jump);

        IRLabel endLb = new IRLabel(labelCount);
        instList.add(endLb);

        return tmp;
    }

    @Override
    public TempVar visit(IfStatement i) throws SemanticException {
        TempVar tmp = (TempVar)i.e.accept(this);
        TempVar condTemp = new TempVar(tmp.type, tmp.name, tmp.number);
        if (variableEnv.lookupInScope(tmp.name) != null) {
            condTemp = allocator.allocate(new BooleanType(), "LOCAL", null);
        }
        IRNegation neg = new IRNegation(condTemp, tmp);
        instList.add(neg);
        
        int elseBlockLbNumber = labelCount;
        IRIfInstruction ifIr = new IRIfInstruction(condTemp, elseBlockLbNumber);
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
        TempVar lhs = (TempVar)a.id.accept(this);
        TempVar index = (TempVar)a.e1.accept(this);
        TempVar rhs = (TempVar)a.e2.accept(this);
        IRArrayAssignment ir = new IRArrayAssignment(lhs, rhs, index);
        instList.add(ir);
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
        IRBinaryOperation ir = new IRBinaryOperation(t, lhs, rhs, "add");
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(SubtractExpression p) throws SemanticException {
        TempVar lhs = (TempVar)p.e1.accept(this);
        TempVar rhs = (TempVar)p.e2.accept(this);
        TempVar t = allocator.allocate(lhs.type, "LOCAL", null);
        IRBinaryOperation ir = new IRBinaryOperation(t, lhs, rhs, "sub");
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(MultExpression m) throws SemanticException {
        TempVar lhs = (TempVar)m.e1.accept(this);
        TempVar rhs = (TempVar)m.e2.accept(this);
        TempVar t = allocator.allocate(lhs.type, "LOCAL", null);
        IRBinaryOperation ir = new IRBinaryOperation(t, lhs, rhs, "mul");
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(EqualityExpression e) throws SemanticException {
        TempVar lhs = (TempVar)e.e1.accept(this);
        TempVar rhs = (TempVar)e.e2.accept(this);
        TempVar t = allocator.allocate(new BooleanType(), "LOCAL", null);
        IREqualityOperation ir = new IREqualityOperation(t, lhs, rhs, cmp_labelCount++);
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(LessThanExpression l) throws SemanticException {
        TempVar lhs = (TempVar)l.e1.accept(this);
        TempVar rhs = (TempVar)l.e2.accept(this);
        TempVar t = allocator.allocate(new BooleanType(), "LOCAL", null);
        IRLessthanOperation ir = new IRLessthanOperation(t, lhs, rhs, cmp_labelCount++);
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(ArrayReference a) throws SemanticException {
        TempVar var = (TempVar)a.id.accept(this);
        TempVar index = (TempVar)a.e.accept(this);
        ArrayType aType = (ArrayType)var.type;
        TempVar t = allocator.allocate(aType.type, "LOCAL", null);
        IRArrayReference ir = new IRArrayReference(t, var, index);
        instList.add(ir);
        return t;
    }

    @Override
    public TempVar visit(FunctionCall f) throws SemanticException {
        TempVar[] params = null;
        if (f.exprList != null) {
            params = (TempVar[])f.exprList.accept(this);
        }
        Function func = functionEnv.lookup(f.id.id.name);
        FunctionDeclaration decl = func.decl;
        if (func.decl == null) {
            return null;
        }
        TempVar t = null;
        if (!(decl.type instanceof VoidType)) {
            t = allocator.allocate(decl.type, "LOCAL", null);
        }
        
        IRFunctionCall ir = new IRFunctionCall(t, func, params, programName);
        instList.add(ir);
        return t;
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
    public TempVar[] visit(ExpressionList l) throws SemanticException {
        int listSize = l.getExpressionCount();
        if (listSize == 0) {
            return null;
        }
        TempVar[] temps = new TempVar[listSize];
        for (int i=0; i < listSize; i++)
        {
            Expression e = l.getExpression(i);
            TempVar t = (TempVar)e.accept(this);
            temps[i] = t;
        }
        return temps;
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
