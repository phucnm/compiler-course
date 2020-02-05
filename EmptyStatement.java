public class EmptyStatement extends Statement {
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}