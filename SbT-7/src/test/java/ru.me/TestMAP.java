package ru.me;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TestMAP {
    @Test
    public void mapTest(){
        mainMAP m = new mainMAP();
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        Map<Integer, String> swappedMap = m.swap(map);
        assertTrue(swappedMap.containsKey(1));
        assertTrue(swappedMap.containsKey(2));
        assertTrue(swappedMap.containsKey(3));
        assertTrue(swappedMap.containsValue("one"));
        assertTrue(swappedMap.containsValue("two"));
        assertTrue(swappedMap.containsValue("three"));

        assertFalse(swappedMap.containsValue(1));
        assertFalse(swappedMap.containsValue(2));
        assertFalse(swappedMap.containsValue(3));
        assertFalse(swappedMap.containsKey(0));
        assertFalse(swappedMap.containsKey("one"));
        assertFalse(swappedMap.containsKey("two"));
        assertFalse(swappedMap.containsKey("three"));
    }

}
