public class PrintVisitor implements Visitor {
    private static int indentConstant = 4;
    public static int indent = 0;

    private void printIndentation(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
    }

    @Override
    public Object visit(Program p) {
        for (int i=0; i< p.getFunctionCount() ; i++)
        {
            Function f = p.getFunction(i);
            f.accept(this);
            System.out.print("\n\n");
        }
        return null;
    }

    @Override
    public Object visit(Function f) {
        f.decl.accept(this);
        f.body.accept(this);
        return null;
    }

    @Override
    public Object visit(FunctionDeclaration d) {
        System.out.print(d.type + " " + d.id.name + "(");
        if (d.params != null) {
            d.params.accept(this);
        }
        System.out.print(")");
        return null;
    }

    @Override
    public Object visit(FormalParameterList l) {
        int listSize = l.getFormalParameterCount();
        for (int i=0; i < listSize - 1; i++)
        {
            FormalParameter p = l.getFormalParameter(i);
            p.accept(this);
            System.out.print(", ");
        }
        l.getFormalParameter(listSize - 1).accept(this);
        return null;
    }

    @Override
    public Object visit(FormalParameter p) {
        p.type.accept(this);
        System.out.print(" ");
        p.id.accept(this);
        return null;
    }

    @Override
    public Object visit(FunctionBody f) {
        System.out.println();
        printIndentation(PrintVisitor.indent);
        System.out.print("{");
        PrintVisitor.indent += PrintVisitor.indentConstant;

        for (int i=0; i< f.getVariableDeclarationCount() ; i++) {
            System.out.println();
            VariableDeclaration v = f.getVariableDeclaration(i);
            v.accept(this);
            System.out.print(";");
        }

        if (f.getVariableDeclarationCount() > 0) {
            System.out.println();
        }

        for (int i=0; i< f.getStatementCount() ; i++)
        {
            System.out.println();
            Statement s = f.getStatement(i);
            s.accept(this);
        }

        System.out.println();
        PrintVisitor.indent -= PrintVisitor.indentConstant;
        printIndentation(PrintVisitor.indent);
        System.out.print("}");
        return null;
    }

    @Override
    public Object visit(VariableDeclaration v) {
        printIndentation(PrintVisitor.indent);
        v.type.accept(this);
        System.out.print(" ");
        v.id.accept(this);
        return null;
    }

    @Override
    public Object visit(Block b) {
        System.out.println();
        printIndentation(PrintVisitor.indent);
        System.out.print("{");
        PrintVisitor.indent += 4;

        for (int i=0; i< b.getStatementCount() ; i++)
        {
            System.out.println();
            Statement s = b.getStatement(i);
            s.accept(this);
        }
        System.out.println();
        PrintVisitor.indent -= 4;
        printIndentation(PrintVisitor.indent);
        System.out.print("}");
        return null;
    }

    @Override
    public Object visit(WhileStatement w) {
        printIndentation(PrintVisitor.indent);
        System.out.print("while (");
        w.expr.accept(this);
        System.out.print(")");
        w.block.accept(this);
        return null;
    }

    @Override
    public Object visit(IfStatement i) {
        printIndentation(PrintVisitor.indent);
        System.out.print("if (");
        i.e.accept(this);
        System.out.print(")");
        i.ifBlock.accept(this);
        if (i.elseBlock != null) {
            System.out.println();
            printIndentation(PrintVisitor.indent);
            System.out.print("else");
            i.elseBlock.accept(this);
        }
        return null;
    }

    @Override
    public Object visit(PrintStatement p) {
        printIndentation(PrintVisitor.indent);
        System.out.print("print ");
        p.e.accept(this);
        System.out.print(";");
        return null;
    }

    @Override
    public Object visit(PrintLnStatement p) {
        printIndentation(PrintVisitor.indent);
        System.out.print("println ");
        p.e.accept(this);
        System.out.print(";");
        return null;
    }

    @Override
    public Object visit(AssignmentStatement a) {
        printIndentation(PrintVisitor.indent);
        a.id.accept(this);
        System.out.print("=");
        a.e.accept(this);
        System.out.print(";");
        return null;
    }

    @Override
    public Object visit(ArrayAssignment a) {
        printIndentation(PrintVisitor.indent);
        a.id.accept(this);
        System.out.print("[");
        a.e1.accept(this);
        System.out.print("]");
        System.out.print("=");
        a.e2.accept(this);
        System.out.print(";");
        return null;
    }

    @Override
    public Object visit(ExpressionStatement e) {
        printIndentation(PrintVisitor.indent);
        e.e.accept(this);
        System.out.print(";");
        return null;
    }

    @Override
    public Object visit(ReturnStatement r) {
        printIndentation(PrintVisitor.indent);
        System.out.print("return");
        if (r.e != null) {
            System.out.print(" ");
            r.e.accept(this);
        }
        System.out.print(";");
        return null;
    }

    @Override
    public Object visit(PlusExpression p) {
        p.e1.accept(this);
        System.out.print ("+");
        p.e2.accept(this);
        return null;
    }
    @Override
    public Object visit(SubtractExpression p) {
        p.e1.accept(this);
        System.out.print ("-");
        p.e2.accept(this);
        return null;
    }

    @Override
    public Object visit(MultExpression m) {
        m.e1.accept(this);
        System.out.print ("*");
        m.e2.accept(this);
        return null;
    }

    @Override
    public Object visit(EqualityExpression e) {
        e.e1.accept(this);
        System.out.print ("==");
        e.e2.accept(this);
        return null;
    }

    @Override
    public Object visit(LessThanExpression l) {
        l.e1.accept(this);
        System.out.print ("<");
        l.e2.accept(this);
        return null;
    }

    @Override
    public Object visit(ArrayReference a) {
        a.id.accept(this);
        System.out.print("[");
        a.e.accept(this);
        System.out.print("]");
        return null;
    }

    @Override
    public Object visit(FunctionCall f) {
        f.id.accept(this);
        System.out.print("(");
        if (f.exprList != null) {
            f.exprList.accept(this);
        }
        System.out.print(")");
        return null;
    }

    @Override
    public Object visit(IdentifierValue iv) {
        System.out.print(iv.id.name);
        return null;
    }

    @Override
    public Object visit(IntegerLiteral il) {
        System.out.print(il.val);
        return null;
    }

    @Override
    public Object visit(FloatLiteral fl) {
        System.out.print(fl.val);
        return null;
    }

    @Override
    public Object visit(StringLiteral sl) {
        System.out.print(sl.val);
        return null;
    }

    @Override
    public Object visit(CharacterLiteral cl) {
        System.out.print(cl.val);
        return null;
    }

    @Override
    public Object visit(BooleanLiteral bl) {
        System.out.print(bl.val);
        return null;
    }

    @Override
    public Object visit(ParenExpression p) {
        System.out.print("(");
        p.e.accept(this);
        System.out.print(")");
        return null;
    }

    @Override
    public Object visit(ExpressionList l) {
        int listSize = l.getExpressionCount();
        for (int i=0; i < listSize - 1; i++)
        {
            Expression e = l.getExpression(i);
            e.accept(this);
            System.out.print(",");
    }
        l.getExpression(listSize - 1).accept(this);
        return null;
    }

    @Override
    public Object visit(IntegerType type) {
        System.out.print(type.toString());
        return null;
    }

    @Override
    public Object visit(FloatType type) {
        System.out.print(type.toString());
        return null;
    }

    @Override
    public Object visit(StringType type) {
        System.out.print(type.toString());
        return null;
    }

    @Override
    public Object visit(CharType type) {
        System.out.print(type.toString());
        return null;
    }

    @Override
    public Object visit(VoidType type) {
        System.out.print(type.toString());
        return null;
    }

    @Override
    public Object visit(ArrayType type) {
        System.out.print(type.toString());
        return null;
    }

    @Override
    public Object visit(BooleanType type) {
        System.out.print(type.toString());
        return null;
    }

    @Override
    public Object visit(Identifier id) {
        System.out.print(id.name);
        return null;
    }
}