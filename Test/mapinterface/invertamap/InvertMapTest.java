package org.example.Day02.mapinterface.invertamap;

import org.junit.jupiter.api.Test;
import org.example.Day02.mapinterface.invertamap.InvertMap;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class InvertMapTest {

    @Test
    void testDistinctMappings() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        Map<Integer, List<String>> invertedMap = InvertMap.invert(map);

        assertEquals(2, invertedMap.size());
        assertTrue(invertedMap.containsKey(1));
        assertTrue(invertedMap.containsKey(2));
        assertEquals(List.of("A"), invertedMap.get(1));
        assertEquals(List.of("B"), invertedMap.get(2));
    }

    @Test
    void testMultipleKeysSameValue() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 1);
        map.put("C", 2);

        Map<Integer, List<String>> invertedMap = InvertMap.invert(map);

        assertEquals(2, invertedMap.size());
        assertTrue(invertedMap.containsKey(1));
        assertTrue(invertedMap.containsKey(2));
        assertEquals(List.of("A", "B"), invertedMap.get(1));
        assertEquals(List.of("C"), invertedMap.get(2));
    }

    @Test
    void testEmptyMap() {
        Map<String, Integer> map = new HashMap<>();

        Map<Integer, List<String>> invertedMap = InvertMap.invert(map);

        assertTrue(invertedMap.isEmpty());
    }
}