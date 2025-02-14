package org.example.Day02.listinterface.findthenthelement;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NthElementFromEndTest {

    @org.junit.jupiter.api.Test
    void testNthElementFromEnd() {
        LinkedList<Integer> list = new LinkedList<>(List.of(10, 20, 30, 40, 50));
        int nthFromEnd = NthElementFromEnd.findNthFromEnd(list, 2);
        assertEquals(40, nthFromEnd, "The 2nd element from the end should be 40.");

    }

}