public class PrintLnStatement extends Statement {
    Expression e;

    public PrintLnStatement(Expression e) {
        this.e = e;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}