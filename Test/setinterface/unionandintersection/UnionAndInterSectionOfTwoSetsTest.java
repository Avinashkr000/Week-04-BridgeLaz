package org.example.Day02.setinterface.unionandintersection;

import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UnionAndInterSectionOfTwoSetsTest {

    @Test
    void testUnionOfTwoSets() {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);


        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        // Assert
        Set<Integer> expectedUnion = new HashSet<>();
        expectedUnion.add(1);
        expectedUnion.add(2);
        expectedUnion.add(3);
        expectedUnion.add(4);
        expectedUnion.add(5);

        assertEquals(expectedUnion, unionSet);
    }

    @Test
    void testIntersectionOfTwoSets() {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);


        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);


        Set<Integer> expectedIntersection = new HashSet<>();
        expectedIntersection.add(3);

        assertEquals(expectedIntersection, intersectionSet);
    }
}