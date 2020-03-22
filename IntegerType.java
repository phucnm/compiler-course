public class IntegerType extends Type {
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public String toString() {
        return "I";
    }

    public String toSignString() {
        return "I";
    }

    public String toStringInArrayCreation() {
        return "int";
    }
}