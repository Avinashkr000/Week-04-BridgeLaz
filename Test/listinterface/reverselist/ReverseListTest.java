package org.example.Day02.listinterface.reverselist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ReverseListTest {

    @Test
    void testReverseList() {

        List<Integer> original = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> expected = new ArrayList<>(List.of(5, 4, 3, 2, 1));


        List<Integer> actual = reverseList(original);


        assertEquals(expected, actual);
    }


    private List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>(list);
        java.util.Collections.reverse(reversed);
        return reversed;
    }
}