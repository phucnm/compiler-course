import java.util.Vector;

public class IRProgram {
    Vector<IRFunction> functions;
    Program p;

    public IRProgram(Program p)
    {
        functions = new Vector<IRFunction>();
        this.p = p;
    }

    public void addFunction(IRFunction s)
    {
        functions.add(s);
    }

    public IRFunction getFunction(int index)
    {
        return functions.elementAt(index);
    }

    public int getFunctionCount()
    {
        return functions.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (IRFunction func: functions) {
            sb.append(func.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}