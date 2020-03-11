public class IRReturnInstruction implements IRInstruction {
    TempVar expr;

    public IRReturnInstruction(TempVar expr) {
        this.expr = expr;
    }

    public String toString() {
        if (expr != null) {
            return "RETURN " + expr.toString() + ";";
        }
        return "RETURN;";
    }
}