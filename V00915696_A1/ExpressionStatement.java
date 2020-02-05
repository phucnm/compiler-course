public class ExpressionStatement extends Statement {

    Expression e;

    public ExpressionStatement(Expression e) {
        this.e = e;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}