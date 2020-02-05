public class BooleanLiteral extends Expression {

    boolean val;

    public BooleanLiteral(boolean val) {
        this.val = val;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}