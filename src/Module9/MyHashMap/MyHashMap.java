package Module9.MyHashMap;

public class MyHashMap<K, V> {
    private static final int DEFAULT_SIZE = 8;
    private Entry<K, V>[] context = new Entry[DEFAULT_SIZE];
    private int size;

    public void put(K key, V value) {
        int index = calculateIndex(key.hashCode());
        Entry<K, V> newEntry = new Entry<>(key, value);
        if (context[index] == null) {
            context[index] = newEntry;
        } else {
            Entry<K, V> current = context[index];
            Entry<K, V> prev = null;
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = newEntry;
        }
        size++;
    }

    public V get(K key) {
        int index = calculateIndex(key.hashCode());
        Entry<K, V> current = context[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = calculateIndex(key.hashCode());
        Entry<K, V> current = context[index];
        Entry<K, V> prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    context[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    public void clear() {
        for (int i = 0; i < context.length; i++) {
            context[i] = null;
        }
        size = 0;
    }
    public int size() {
        return size;
    }

    private int calculateIndex(int hashCode) {
        return Math.abs(hashCode % context.length);
    }

    static class Entry<K, V> {
        private K key;
        private V value;
        Entry<K, V> next;


        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

}
