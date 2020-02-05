public class StringLiteral extends Expression {

    String val;

    public StringLiteral(String val) {
        StringBuilder builder = new StringBuilder(val);
        builder.deleteCharAt(val.length() - 1);
        builder.deleteCharAt(0);
        this.val = builder.toString();
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}