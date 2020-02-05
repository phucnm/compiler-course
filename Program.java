import java.util.Vector;

public class Program implements ASTNode {
    Vector<Function> functions;

    public Program()
    {
        functions = new Vector<Function>();
    }

    public void addFunction(Function s)
    {
        functions.add(s);
    }

    public Function getFunction(int index)
    {
        return functions.elementAt(index);
    }

    public int getFunctionCount()
    {
        return functions.size();
    }

    @Override
    public Object accept(Visitor visitor)
    {
        return visitor.visit(this);
    }
}