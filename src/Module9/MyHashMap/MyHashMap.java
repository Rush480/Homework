package Module9.MyHashMap;

public class MyHashMap<K, V> {
    private static final int DEFAULT_SIZE = 16;
    private Entry<K, V>[] context = new Entry[DEFAULT_SIZE];

    public void put(K key, V value) {
        int index = calculateIndex(key.hashCode());
        Entry<K, V> newEntry = new Entry<>(key, value);
        if (context[index] == null) {
            context[index] = newEntry;
        } else {
           // iterate linked list save as last
        }
    }

    public V get(K key){
        int index = calculateIndex(key.hashCode());
        if(context[index].key.equals(key)){
            return context[index].value;
        }else{
            // iterate linked list and compare with equals
        }
        return null;
    }


    private int calculateIndex(int hashCode) {
        return Math.abs(hashCode % context.length);
    }

    static class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;


        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

}
