public class IRAssignInstruction implements IRInstruction {
    TempVar lhs, rhs;

    public IRAssignInstruction(TempVar lhs, TempVar rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public String toString() {
        return lhs.toString() + " := " + rhs.toString() + ";";
    }
}