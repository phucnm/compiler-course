import java.util.List;

public class IRFunction extends Function implements IRInstruction {
    Function func;
    TempAllocator allocator;
    List<IRInstruction> instList;

    public IRFunction(Function func, List<IRInstruction> instList, TempAllocator allocator) {
        super(func.decl, func.body);
        this.func = func;
        this.instList = instList;
        this.allocator = allocator;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FUNC " + func.decl.id.name);
        sb.append(" (");
        for (FormalParameter p: func.decl.params.params) {
            sb.append(p.type.toString());
        }
        sb.append(")");
        sb.append(func.decl.type.toString());
        sb.append("\n{");
        for (TempVar t: allocator.temps) {
            sb.append("\nTEMP " + t.number + ":" + t.type.toString() + ";");
        }
        for (IRInstruction in: instList) {
            sb.append("\n" + in.toString());
        }
        sb.append("\n}");
        return sb.toString();   
    }
}