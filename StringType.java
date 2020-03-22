public class StringType extends Type {
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public String toString() {
        return "U";
    }

    public String toSignString() {
        return "Ljava/lang/String;";
    }

    public String toStringInArrayCreation() {
        return "java/lang/String";
    }
}