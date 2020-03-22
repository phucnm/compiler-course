public class ArrayType extends Type {
    Type type;
    IntegerLiteral size;

    public ArrayType(Type type, IntegerLiteral size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ArrayType objType = (ArrayType)o;
        if (!objType.type.equals(this.type) || !objType.size.equals(this.size)) {
            return false;
        }

        return true;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public String toString() {
        return "A" + type.toString();
    }

    public String toSignString() {
        return String.format("[%s", type.toSignString());
    }

    public String toStringInArrayCreation() {
        return "n/a";
    }
}