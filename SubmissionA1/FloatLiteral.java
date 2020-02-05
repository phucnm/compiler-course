public class FloatLiteral extends Expression {

    Float val;

    public FloatLiteral(Float val) {
        this.val = val;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}