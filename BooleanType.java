public class BooleanType extends Type {
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public String toString() {
        return "Z";
    }

    public String toSignString() {
        return "Z";
    }

    public String toStringInArrayCreation() {
        return "boolean";
    }
}