public class PrintStatement extends Statement {
    Expression e;

    public PrintStatement(Expression e) {
        this.e = e;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}