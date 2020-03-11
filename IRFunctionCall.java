public class IRFunctionCall implements IRInstruction {
    TempVar t;
    FunctionDeclaration func;
    TempVar[] temps;

    public IRFunctionCall(TempVar t, FunctionDeclaration func, TempVar[] temps) {
        this.t = t;
        this.func = func;
        this.temps = temps;
    }

    public String toString() {
        String paramStr = "";
        if (temps != null) {
            String[] params = new String[temps.length];
            for (int i = 0; i < temps.length; i++) {
                params[i] = temps[i].toString();
            }

            paramStr = String.format("(%s)", String.join(",", params));
        }
        String assignmentStr = t != null ? String.format("%s := ", t.toString()) : "";
        return String.format("%sCALL %s%s;", assignmentStr, func.id.name, paramStr);
    }
}