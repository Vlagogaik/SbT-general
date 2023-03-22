package ru.me;
import java.util.HashMap;
import java.util.Map;

public class mainMAP <K,V>{
    public Map<V, K> swap (Map<K, V> map) {
        Map<V, K> swappedMap = new HashMap<>();
        for(Map.Entry<K, V> b: map.entrySet()) {
            swappedMap.put(b.getValue(), b.getKey());
        }
        return swappedMap;
    }
}
