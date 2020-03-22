public class Value {
    Object object;
    public Value(Object o) {
        this.object = o;
    }

    public String toString() {
        if (object instanceof Character) {
            return String.format("%d", (int)((Character)object).charValue());
        } else if (object instanceof String) {
            return String.format("\"%s\"", object.toString());
        }
        return object.toString();
    }
}