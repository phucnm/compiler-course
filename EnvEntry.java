public class EnvEntry<K, V> {
    public K key;
    public V value;

    public String toString() {
        return String.format("%s: %s", key, value);
    }

    public EnvEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}