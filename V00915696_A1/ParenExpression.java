public class ParenExpression extends Expression {
    Expression e;

    public ParenExpression(Expression e) {
        this.e = e;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}