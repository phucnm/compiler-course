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

    public String toBytecodeString() {
        StringBuilder sb = new StringBuilder();
        sb.append(".source " + name + ".ir\n");
        sb.append(".class public " + name + "\n");
        sb.append(".super java/lang/Object\n");

        for (IRFunction func: functions) {
            sb.append(func.toBytecodeString());
            sb.append("\n");
        }
        sb.append("\n;--------------------------------------------;");
        sb.append("\n;                                            ;");
        sb.append("\n; Boilerplate                                ;");
        sb.append("\n;                                            ;");
        sb.append("\n;--------------------------------------------;");
        sb.append("\n");
        sb.append("\n.method public static main([Ljava/lang/String;)V");
        sb.append("\n    ; set limits used by this method");
        sb.append("\n    .limit locals 1");
        sb.append("\n    .limit stack 4");
        sb.append(String.format("\n    invokestatic %s/__main()V", name));
        sb.append("\n    return");
        sb.append("\n.end method");
        sb.append("\n");
        sb.append("\n; standard initializer");
        sb.append("\n.method public <init>()V");
        sb.append("\n    aload_0");
        sb.append("\n    invokenonvirtual java/lang/Object/<init>()V");
        sb.append("\n    return");
        sb.append("\n.end method");     
        return sb.toString();
    }
}