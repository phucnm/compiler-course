import java.util.Vector;

public class TempAllocator {
    int MAX_LOCALS = 65536;
    Vector<TempVar> temps;
    int next = 0;

    public TempAllocator() {
        temps = new Vector<TempVar>();
    }
    
    public TempVar allocate(Type t, String name, TempType tType){
        TempVar tmp = initialize(t, name, tType);
        temps.add(tmp);
        return tmp;
    }

    private TempVar initialize(Type t, String name, TempType tType) {
        return new TempVar(t, name, next++);
    }
}
