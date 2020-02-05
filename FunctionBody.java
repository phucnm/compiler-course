import java.util.Vector;

public class FunctionBody implements ASTNode {
    Vector<VariableDeclaration> varDecls;
    Vector<Statement> stmts;

    public FunctionBody()
    {
        varDecls = new Vector<VariableDeclaration>();
        stmts = new Vector<Statement>();
    }

    public void addStatement(Statement s) {
        stmts.add(s);
    }

    public Statement getStatement(int index)
    {
        return stmts.elementAt(index);
    }

    public int getStatementCount()
    {
        return stmts.size();
    }

    public void addVariableDeclaration(VariableDeclaration s) {
        varDecls.add(s);
    }

    public VariableDeclaration getVariableDeclaration(int index)
    {
        return varDecls.elementAt(index);
    }

    public int getVariableDeclarationCount()
    {
        return varDecls.size();
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}