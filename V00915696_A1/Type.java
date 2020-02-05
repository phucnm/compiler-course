public abstract class Type {
    public abstract Object accept(Visitor v);
    public abstract String toString();
}