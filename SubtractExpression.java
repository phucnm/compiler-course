public class SubtractExpression extends Expression {
    Expression e1;
    Expression e2;

    public SubtractExpression(Expression e1, Expression e2)
    {
        this.e1 = e1;
        this.e2 = e2;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}