import java.util.Vector;

public class ExpressionList implements ASTNode {
    Vector<Expression> exprList;

    public ExpressionList()
    {
        exprList = new Vector<Expression>();
    }

    public void addExpression(Expression s)
    {
        exprList.add(s);
    }

    public Expression getExpression(int index)
    {
        return exprList.elementAt(index);
    }

    public int getExpressionCount()
    {
        return exprList.size();
    }

    @Override
    public Object accept(Visitor visitor)
    {
        return visitor.visit(this);
    }
}