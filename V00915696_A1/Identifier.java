public class Identifier implements ASTNode
{
    String name;

    public Identifier (String name)
    {
        this.name = name;
    }

    @Override
    public Object accept(Visitor v)
    {
        return v.visit(this);
    }
}
