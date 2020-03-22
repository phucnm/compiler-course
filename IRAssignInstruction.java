public class IRAssignInstruction implements IRInstruction {
    TempVar lhs, rhs;

    public IRAssignInstruction(TempVar lhs, TempVar rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public String toString() {
        return lhs.toString() + " := " + rhs.toString() + ";";
    }

    @Override
    public String toBytecodeString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%sload %d", rhs.type.toString().toLowerCase(), rhs.number));
        sb.append(String.format("\n    %sstore %d", lhs.type.toString().toLowerCase(), lhs.number));
        return sb.toString();
    }
}