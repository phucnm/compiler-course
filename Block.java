import java.util.Vector;

public class Block implements ASTNode {
    Vector<Statement> stmts;
    int jumpLbNumb = -1;

    public Block()
    {
        stmts = new Vector<Statement>();
    }

    public void addStatement(Statement s)
    {
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

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}