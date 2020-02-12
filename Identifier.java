public class Identifier implements ASTNode
{
    String name;
    int line;
    int pos;

    public Identifier (String name, int line, int pos)
    {
        this.name = name;
        this.line = line;
        this.pos = pos;
    }

    @Override
    public Object accept(Visitor v)
    {
        return v.visit(this);
    }
}
