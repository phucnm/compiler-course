public class FloatType extends Type {
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public String toString() {
        return "F";
    }

    public String toSignString() {
        return "F";
    }

    public String toStringInArrayCreation() {
        return "float";
    }
}