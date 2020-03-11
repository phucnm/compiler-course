public class IRPrintInstruction implements IRInstruction {
    TempVar expr;
    Boolean newLine;

    public IRPrintInstruction(TempVar expr, Boolean newLine) {
        this.expr = expr;
        this.newLine = newLine;
    }

    public String toString() {
        String newLineStr = newLine ? "LN" : "";
        return String.format("PRINT%s%s %s;", newLineStr, expr.type.toString(), expr.toString());
    }
}