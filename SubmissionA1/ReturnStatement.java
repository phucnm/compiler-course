public class ReturnStatement extends Statement {
    Expression e;

    public ReturnStatement(Expression e) {
        this.e = e;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}