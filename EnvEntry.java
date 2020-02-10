public class EnvEntry<K, V> {
    public K key;
    public V value;
    public EnvEntryType type = EnvEntryType.ENTRY;

    public String toString() {
        if (type == EnvEntryType.BEGIN_SCOPE) {
            return "BEGIN";
        } else if (type == EnvEntryType.END_SCOPE) {
            return "END";
        }
        return String.format("%s: %s", key, value);
    }

    public EnvEntry(EnvEntryType type) {
        this.type = type;
    }

    public EnvEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}