public class IRConstantAssign implements IRInstruction {
    TempVar t; 
    Value val;

    public IRConstantAssign(TempVar t, Value val) {
        this.t = t;
        this.val = val;
    }

    public String toString() {
        return t.toString() + " := " + val.toString() + ";";
    }

    @Override
    public String toBytecodeString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("ldc %s", val.toString()));
        String type = (t.type instanceof StringType) ? "a" : t.type.toString().toLowerCase();
        sb.append(String.format("\n    %sstore %d", type, t.number));
        return sb.toString();
    }
}