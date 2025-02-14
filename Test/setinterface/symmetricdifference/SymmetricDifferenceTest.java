package org.example.Day02.setinterface.symmetricdifference;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.HashSet;

class SymmetricDifferenceTest {

    @Test
    void testNonOverlappingSets() {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(4, 5, 6);
        Set<Integer> result = SymmetricDifference.computeSymmetricDifference(set1, set2);
        assertEquals(Set.of(1, 2, 3, 4, 5, 6), result);
    }

    @Test
    void testPartiallyOverlappingSets() {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 4, 5);
        Set<Integer> result = SymmetricDifference.computeSymmetricDifference(set1, set2);
        assertEquals(Set.of(1, 2, 4, 5), result);
    }

    @Test
    void testCompletelyOverlappingSets() {
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(1, 2, 3);
        Set<Integer> result = SymmetricDifference.computeSymmetricDifference(set1, set2);
        assertTrue(result.isEmpty());
    }
}