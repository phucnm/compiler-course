public class IRArrayReference implements IRInstruction {
    TempVar t, var, index;

    public IRArrayReference(TempVar t, TempVar var, TempVar index) {
        this.t = t;
        this.var = var;
        this.index = index;
    }

    public String toString() {
        return String.format("%s := %s[%s];", t.toString(), var.toString(), index.toString());
    }

    @Override
    public String toBytecodeString() {
        String elementType = ((ArrayType)var.type).type.toString().toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("aload %d", var.number));
        sb.append(String.format("\n    %sload %d", index.type.toString().toLowerCase(), index.number));
        sb.append(String.format("\n    %saload", elementType));
        sb.append(String.format("\n    %sstore %d", elementType, t.number));
        return sb.toString();
    }
}