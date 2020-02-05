public class IdentifierValue extends Expression
{
    Identifier id;
    public IdentifierValue (Identifier id)
    {
        this.id = id;
    }

    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
