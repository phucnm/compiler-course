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
        if (func.decl.params != null) {
            for (FormalParameter p: func.decl.params.params) {
                sb.append(p.type.toString());
            }
        }
        sb.append(")");
        sb.append(func.decl.type.toString());
        sb.append("\n{");
        for (TempVar t: allocator.temps) {
            sb.append("\n    TEMP " + t.number + ":" + t.type.toString() + ";");
        }
        IRInstruction lastIR = null;
        for (IRInstruction ir: instList) {
            if (ir instanceof IRLabel) {
                sb.append("\n" + ir.toString());
            } else {
                sb.append("\n        " + ir.toString());
            }
            
            lastIR = ir;
        }
        if (func.decl.type instanceof VoidType && (lastIR == null || !(lastIR instanceof IRReturnInstruction))) {
            sb.append("\n        " + new IRReturnInstruction(null));
        }
        sb.append("\n}");
        return sb.toString();   
    }

    @Override
    public String toBytecodeString() {
        StringBuilder sb = new StringBuilder();
        sb.append(".method public static ");
        sb.append(func.functionSignature());
        sb.append("\n    .limit stack 16");
        sb.append(String.format("\n    .limit locals %d", allocator.temps.size()));
        IRInstruction lastIR = null;
        for (IRInstruction ir: instList) {
            if (ir instanceof IRLabel) {
                sb.append("\n" + ir.toBytecodeString());
            } else {
                sb.append("\n    " + ir.toBytecodeString());
            }
            
            lastIR = ir;
        }
        if (func.decl.type instanceof VoidType && (lastIR == null || !(lastIR instanceof IRReturnInstruction))) {
            sb.append("\n    " + (new IRReturnInstruction(null)).toBytecodeString());
        }
        sb.append("\n.end method");
        return sb.toString();
    }
}