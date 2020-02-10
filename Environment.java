import java.util.ArrayList;

public class Environment<K, V> {

    private ArrayList<EnvEntry<K, V>> symbolTables = new ArrayList<EnvEntry<K, V>>();

    public String toString() {
        return String.format("%s", symbolTables);
    }

    public void beginScope() {
        symbolTables.add(new EnvEntry<K, V>(EnvEntryType.BEGIN_SCOPE));
    }

    public void endScope() {
        symbolTables.add(new EnvEntry<K, V>(EnvEntryType.END_SCOPE));
    }

    public void add(K key, V value) {
        symbolTables.add(new EnvEntry<K, V>(key, value));
    }

    public V lookup(K key) {
        for (int i = symbolTables.size() - 1; i >= 0; i--) {
            if (symbolTables.get(i).key.equals(key)) {
                return symbolTables.get(i).value;
            }
        }
        return null;
    }

    public V lookupInScope(K key) {
        for (int i = symbolTables.size() - 1; i >= 0; i--) {
            EnvEntry<K, V> entry = symbolTables.get(i);
            if (entry.type == EnvEntryType.BEGIN_SCOPE) {
                break;
            }
            if (entry.key.equals(key)) {
                return symbolTables.get(i).value;
            }
        }
        return null;
    }
}