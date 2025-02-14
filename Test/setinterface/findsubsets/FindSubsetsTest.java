package org.example.Day02.setinterface.findsubsets;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class FindSubsetsTest {

    @Test
    void testIsSubsetWithSubset() {
        Set<Integer> subset = new HashSet<>(Set.of(1, 2));
        Set<Integer> superset = new HashSet<>(Set.of(1, 2, 3, 4));
        assertTrue(FindSubsets.isSubset(subset, superset));
    }

    @Test
    void testIsSubsetWithNonSubset() {
        Set<Integer> subset = new HashSet<>(Set.of(5, 6));
        Set<Integer> superset = new HashSet<>(Set.of(1, 2, 3, 4));
        assertFalse(FindSubsets.isSubset(subset, superset));
    }

    @Test
    void testIsSubsetWithEmptySubset() {
        Set<Integer> subset = new HashSet<>();
        Set<Integer> superset = new HashSet<>(Set.of(1, 2, 3, 4));
        assertTrue(FindSubsets.isSubset(subset, superset));
    }

    @Test
    void testIsSubsetWithEmptySuperset() {
        Set<Integer> subset = new HashSet<>(Set.of(1));
        Set<Integer> superset = new HashSet<>();
        assertFalse(FindSubsets.isSubset(subset, superset));
    }

    @Test
    void testIsSubsetWithSameSets() {
        Set<Integer> subset = new HashSet<>(Set.of(1, 2, 3, 4));
        Set<Integer> superset = new HashSet<>(Set.of(1, 2, 3, 4));
        assertTrue(FindSubsets.isSubset(subset, superset));
    }
}