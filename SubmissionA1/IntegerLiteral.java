public class IntegerLiteral extends Expression {

    Integer val;

    public IntegerLiteral(Integer val) {
        this.val = val;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}