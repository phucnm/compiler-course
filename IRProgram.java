import java.util.Vector;

public class IRProgram {
    Vector<IRFunction> functions;
    Program p;
    String name; 
    public IRProgram(Program p, String name)
    {
        functions = new Vector<IRFunction>();
        this.name = name;
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
        sb.append("PROG " + name + "\n");
        for (IRFunction func: functions) {
            sb.append(func.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}