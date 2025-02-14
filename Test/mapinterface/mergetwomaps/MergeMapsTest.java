package org.example.Day02.mapinterface.mergetwomaps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Map;

class MergeMapsTest {

    @Test
    void testMergeWithOverlappingKeys() {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        Map<String, Integer> result = MergeMaps.merge(map1, map2);

        assertEquals(3, result.size());
        assertEquals(1, result.get("A"));
        assertEquals(5, result.get("B"));
        assertEquals(4, result.get("C"));
    }

    @Test
    void testMergeWithoutOverlappingKeys() {
        Map<String, Integer> map1 = Map.of("A", 1);
        Map<String, Integer> map2 = Map.of("B", 2);

        Map<String, Integer> result = MergeMaps.merge(map1, map2);

        assertEquals(2, result.size());
        assertEquals(1, result.get("A"));
        assertEquals(2, result.get("B"));
    }

    @Test
    void testMergeEmptyMaps() {
        Map<String, Integer> map1 = Map.of();
        Map<String, Integer> map2 = Map.of();

        Map<String, Integer> result = MergeMaps.merge(map1, map2);

        assertTrue(result.isEmpty());
    }
}