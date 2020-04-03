public class IRFunctionCall implements IRInstruction {
    TempVar t;
    Function func;
    TempVar[] temps;
    String progName;

    public IRFunctionCall(TempVar t, Function func, TempVar[] temps, String progName) {
        this.t = t;
        this.func = func;
        this.temps = temps;
        this.progName = progName;
    }

    public String toString() {
        String paramStr = "";
        if (temps != null) {
            String[] params = new String[temps.length];
            for (int i = 0; i < temps.length; i++) {
                params[i] = temps[i].toString();
            }

            paramStr = String.format("(%s)", String.join("", params));
        }
        String assignmentStr = t != null ? String.format("%s := ", t.toString()) : "";
        return String.format("%sCALL %s%s;", assignmentStr, func.decl.id.name, paramStr);
    }

    @Override
    public String toBytecodeString() {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        if (temps != null) {
            for (TempVar t: temps) {
            if (first == true) {
                sb.append(String.format("%sload %d", t.type.toSignString().toLowerCase(), t.number));    
                first = false;
            } else {
                sb.append(String.format("\n    %sload %d", t.type.toString().toLowerCase(), t.number));
            }
        }
        }
        sb.append(String.format("\n    invokestatic %s/%s", progName, func.functionSignature().replace(" ", "")));
        if (t != null) {
            sb.append(String.format("\n    %sstore %d", t.type.toString().toLowerCase(), t.number));
        }
        return sb.toString();
    }
}