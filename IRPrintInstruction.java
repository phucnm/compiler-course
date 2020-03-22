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

    @Override
    public String toBytecodeString() {
        String newLineStr = newLine ? "ln" : "";
        StringBuilder sb = new StringBuilder();
        sb.append("getstatic java/lang/System/out Ljava/io/PrintStream;");
        if (expr.type instanceof StringType) {
            sb.append(String.format("\n    aload %d", expr.number));
        } else {
            sb.append(String.format("\n    %sload %d", expr.type.toString().toLowerCase(), expr.number));
        }
        
        sb.append(String.format("\n    invokevirtual java/io/PrintStream/print%s(%s)V", newLineStr, expr.type.toSignString()));
        return sb.toString();
    }
}