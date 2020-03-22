public class VoidType extends Type {
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public String toString() {
        return "V";
    }

    public String toSignString() {
        return "V";
    }

    public String toStringInArrayCreation() {
        return "V";
    }
}