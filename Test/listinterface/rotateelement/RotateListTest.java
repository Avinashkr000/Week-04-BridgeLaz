package org.example.Day02.listinterface.rotateelement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RotateListTest {

    @Test
    void testRotateList() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        int rotateBy = 2;
        List<Integer> expectedList = Arrays.asList(4, 5, 1, 2, 3);

        List<Integer> resultList = new ArrayList<>(inputList);
        RotateList.rotateList(resultList, rotateBy);

        assertEquals(expectedList, resultList);
    }

}