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
}