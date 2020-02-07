public class TypeCheckVisitor implements Visitor {
    private Environment<String, Type> variableEnv = new Environment<>();
    @Override
    public Type visit(Program p) {
        for (int i=0; i< p.getFunctionCount() ; i++)
        {
            Function f = p.getFunction(i);
            f.accept(this);
        }
        return null;
    }

    @Override
    public Type visit(Function f) {
        f.decl.accept(this);
        f.body.accept(this);
        return null;
    }

    @Override
    public Type visit(FunctionDeclaration d) {
        if (d.params != null) {
            d.params.accept(this);
        }
        return null;
    }

    @Override
    public Type visit(FormalParameterList l) {
        int listSize = l.getFormalParameterCount();
        for (int i=0; i < listSize; i++)
        {
            FormalParameter p = l.getFormalParameter(i);
            p.accept(this);
        }
        return null;
    }

    @Override
    public Type visit(FormalParameter p) {
        p.type.accept(this);
        p.id.accept(this);
        return null;
    }

    @Override
    public Type visit(FunctionBody f) {
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
    public Type visit(VariableDeclaration v) {
        variableEnv.add(v.id.name, v.type);
        System.out.println(variableEnv);
        return null;
    }

    @Override
    public Type visit(Block b) {
        for (int i=0; i< b.getStatementCount() ; i++)
        {
            Statement s = b.getStatement(i);
            s.accept(this);
        }
        return null;
    }

    @Override
    public Type visit(WhileStatement w) {
        w.expr.accept(this);
        w.block.accept(this);
        return null;
    }

    @Override
    public Type visit(IfStatement i) {
        i.e.accept(this);
        i.ifBlock.accept(this);
        if (i.elseBlock != null) {
            i.elseBlock.accept(this);
        }
        return null;
    }

    @Override
    public Type visit(PrintStatement p) {
        p.e.accept(this);
        return null;
    }

    @Override
    public Type visit(PrintLnStatement p) {
        p.e.accept(this);
        return null;
    }

    @Override
    public Type visit(AssignmentStatement a) {
        a.id.accept(this);
        a.e.accept(this);
        return null;
    }

    @Override
    public Type visit(ArrayAssignment a) {
        a.id.accept(this);
        a.e1.accept(this);
        a.e2.accept(this);
        return null;
    }

    @Override
    public Type visit(ExpressionStatement e) {
        e.e.accept(this);
        return null;
    }

    @Override
    public Type visit(ReturnStatement r) {
        if (r.e != null) {
            r.e.accept(this);
        }
        return null;
    }

    @Override
    public Type visit(EmptyStatement s) {
        return null;
    }

    @Override
    public Type visit(PlusExpression p) {
        Type typeA = (Type)p.e1.accept(this);
        Type typeB = (Type)p.e2.accept(this);
        if (!typeA.equals(typeB)) {
            return null;
        }
        return typeA;
    }
    @Override
    public Type visit(SubtractExpression p) {
        return null;
    }

    @Override
    public Type visit(MultExpression m) {
        return null;
    }

    @Override
    public Type visit(EqualityExpression e) {
        return null;
    }

    @Override
    public Type visit(LessThanExpression l) {
        return null;
    }

    @Override
    public Type visit(ArrayReference a) {
        return null;
    }

    @Override
    public Type visit(FunctionCall f) {
        return null;
    }

    @Override
    public Type visit(IdentifierValue iv) {
        return variableEnv.lookup(iv.id.name);
    }

    @Override
    public Type visit(IntegerLiteral il) {
        return new IntegerType();
    }

    @Override
    public Type visit(FloatLiteral fl) {
        return new FloatType();
    }

    @Override
    public Type visit(StringLiteral sl) {
        return new StringType();
    }

    @Override
    public Type visit(CharacterLiteral cl) {
        return new CharType();
    }

    @Override
    public Type visit(BooleanLiteral bl) {
        return new BooleanType();
    }

    @Override
    public Type visit(ParenExpression p) {
        return null;
    }

    @Override
    public Type visit(ExpressionList l) {
        return null;
    }

    @Override
    public Type visit(IntegerType type) {
        return null;
    }

    @Override
    public Type visit(FloatType type) {
        return null;
    }

    @Override
    public Type visit(StringType type) {
        return null;
    }

    @Override
    public Type visit(CharType type) {
        return null;
    }

    @Override
    public Type visit(VoidType type) {
        return null;
    }

    @Override
    public Type visit(ArrayType type) {
        return null;
    }

    @Override
    public Type visit(BooleanType type) {
        return null;
    }

    @Override
    public Type visit(Identifier id) {
        return null;
    }
}