public abstract class Expression {
    public abstract Object accept(Visitor v);
}