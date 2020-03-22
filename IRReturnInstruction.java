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

    @Override
    public String toBytecodeString() {
        if (expr != null) {
            String type = expr.type.toString().toLowerCase();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%sload %d", type, expr.number));
            sb.append(String.format("\n    %sreturn", type));
            return sb.toString();
        }
        return "return";   
    }
}