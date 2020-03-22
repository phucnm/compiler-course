public class CharType extends Type {
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public String toString() {
        return "I";
    }

    public String toSignString() {
        return "C";
    }

    public String toStringInArrayCreation() {
        return "char";
    }
}