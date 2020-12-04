import java.util.LinkedHashMap;
import java.util.Map;

public class LRU_cache<K, V> {
    private int initialCap;
    private int maxCap;
    private Map<K, V> cache;

    public LRU_cache(int initialCap, int maxCap) {
        this.initialCap = initialCap;
        this.maxCap = maxCap;
        this.cache = new LinkedHashMap<K, V>(maxCap, 1.0F, true) {
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > maxCap;
            }

        };

    }

    public void put(K key, V value) {
        cache.put(key, value);
    }

    public V get(K key) {
        return cache.get(key);
    }
}
