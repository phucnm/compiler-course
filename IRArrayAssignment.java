public class IRArrayAssignment implements IRInstruction {
    TempVar lhs, rhs, index;

    public IRArrayAssignment(TempVar lhs, TempVar rhs, TempVar index) {
        this.lhs = lhs;
        this.rhs = rhs;
        this.index = index;
    }

    public String toString() {
        return String.format("%s[%s] := %s;", lhs.toString(), index.toString(), rhs.toString());
    }

    @Override
    public String toBytecodeString() {
        String elementType = ((ArrayType)lhs.type).type.toString().toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("aload %d", lhs.number));
        sb.append(String.format("\n    %sload %d", index.type.toString().toLowerCase(), index.number));
        sb.append(String.format("\n    %sload %d", elementType, rhs.number));
        sb.append(String.format("\n    %sastore", elementType));
        return sb.toString();
    }
}