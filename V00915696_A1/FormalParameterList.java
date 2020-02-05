import java.util.Vector;

public class FormalParameterList implements ASTNode {
    Vector<FormalParameter> params;

    public FormalParameterList()
    {
        params = new Vector<FormalParameter>();
    }

    public void addFormalParameter(FormalParameter s)
    {
        params.add(s);
    }

    public FormalParameter getFormalParameter(int index)
    {
        return params.elementAt(index);
    }

    public int getFormalParameterCount()
    {
        return params.size();
    }

    @Override
    public Object accept(Visitor visitor)
    {
        return visitor.visit(this);
    }
}