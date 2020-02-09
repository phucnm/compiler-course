public class ArrayReference extends Expression {
    IdentifierValue id;
    Expression e;

    public ArrayReference(Identifier id, Expression e)
    {
        this.id = new IdentifierValue(id);
        this.e = e;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}