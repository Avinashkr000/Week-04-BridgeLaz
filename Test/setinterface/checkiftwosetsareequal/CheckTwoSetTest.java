package org.example.Day02.setinterface.checkiftwosetsareequal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.HashSet;

class CheckTwoSetTest {

    @Test
    void testAreEqual_True() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        assertTrue(CheckTwoSet.areEqual(set1, set2));
    }

    @Test
    void testAreEqual_False() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);

        assertFalse(CheckTwoSet.areEqual(set1, set2));
    }
}