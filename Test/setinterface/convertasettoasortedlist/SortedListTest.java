package org.example.Day02.setinterface.convertasettoasortedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;

class SortedListTest {

    @Test
    void testConvertSetToSortedList() {
        Set<Integer> testSet = new HashSet<>(Arrays.asList(3, 1, 4, 1, 5, 9));
        List<Integer> sortedList = SortedList.convertSetToSortedList(testSet);
        assertEquals(Arrays.asList(1, 3, 4, 5, 9), sortedList, "The converted list should be sorted.");
    }
}