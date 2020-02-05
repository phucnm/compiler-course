public class ArrayReference extends Expression {
    Identifier id;
    Expression e;

    public ArrayReference(Identifier id, Expression e)
    {
        this.id = id;
        this.e = e;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}