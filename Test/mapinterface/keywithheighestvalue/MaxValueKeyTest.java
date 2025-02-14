package org.example.Day02.mapinterface.keywithheighestvalue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Map;

class MaxValueKeyTest {

    @Test
    void testFindKeyWithMaxValue_NormalCase() {
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);
        String result = MaxValueKey.findKeyWithMaxValue(map);
        assertEquals("B", result);
    }

    @Test
    void testFindKeyWithMaxValue_EmptyMap() {
        Map<String, Integer> map = Map.of();
        String result = MaxValueKey.findKeyWithMaxValue(map);
        assertNull(result);
    }

    @Test
    void testFindKeyWithMaxValue_SingleEntry() {
        Map<String, Integer> map = Map.of("A", 42);
        String result = MaxValueKey.findKeyWithMaxValue(map);
        assertEquals("A", result);
    }

    @Test
    void testFindKeyWithMaxValue_NegativeValues() {
        Map<String, Integer> map = Map.of("A", -10, "B", -20, "C", -5);
        String result = MaxValueKey.findKeyWithMaxValue(map);
        assertEquals("C", result);
    }
}