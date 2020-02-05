public class ArrayType extends Type {
    Type type;
    IntegerLiteral size;

    public ArrayType(Type type, IntegerLiteral size) {
        this.type = type;
        this.size = size;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public String toString() {
        return type.toString() + "[" + Integer.toString(size.val) + "]";
    }
}