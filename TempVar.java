public class TempVar { 
    int number;
    Type type;
    String name;

    public TempVar(Type type, String name, int number) {
        this.type = type;
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return "T" + number; 
    }
}