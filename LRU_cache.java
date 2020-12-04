import java.util.HashMap;
import java.util.LinkedHashMap;


public class LRU_cache<K, V> {
    private int initialCap;
    private int maxCap;
    private HashMap<K, V> cache;
    Node head;
    Node tail;
    static class Node {
        Integer key;
        Node next;
        Node prev;

        Node(Integer da) {
            key  = da;
            prev = null;
            next = null;
        }
    }
    public LRU_cache(int initialCap, int maxCap) {
        this.initialCap = initialCap;
        this.maxCap = maxCap;
        this.cache = new LinkedHashMap<K, V>(this.maxCap,1.0F, true);

    }

    public void put(K key, V value) {
       
        if (cache.containsKey(key))
            cache.remove(key);
        else {
            this.initialCap = this.initialCap +1;
        }
        cache.put(key, value);

    }

    public V get(K key) {
        return cache.get(key);
    }


    public static void main (String [] args){
        LRU_cache<Integer, String> cache = new LRU_cache<Integer, String>(0, 4);
        cache.put(10, "Hello");
        cache.put(13, "fine");
        cache.put(45, " OK");
        cache.put(67, "never");
        System.out.println(cache.get(10));
        cache.put(23, "new");
        System.out.println(cache.get(10));
        System.out.println(cache.get(23));
    }
}
