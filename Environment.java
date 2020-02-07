import java.util.ArrayList;

public class Environment<K, V> {

    private ArrayList<EnvEntry<K, V>> symbolTables = new ArrayList<EnvEntry<K, V>>();

    public String toString() {
        return String.format("%s", symbolTables);
    }

    public void beginScope() {

    }

    public void endScope() {

    }

    public void add(K key, V value) {
        symbolTables.add(new EnvEntry<K, V>(key, value));
    }

    public V lookup(K key) {
        for (int i = 0; i < symbolTables.size(); i++) {
            if (symbolTables.get(i).key.equals(key)) {
                return symbolTables.get(i).value;
            }
        }
        return null;
    }

}