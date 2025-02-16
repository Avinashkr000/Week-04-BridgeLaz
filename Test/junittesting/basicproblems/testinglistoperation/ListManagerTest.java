package org.example.Day05.junittesting.basicproblems.testinglistoperation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class ListManagerTest {
        @Test
        public void testAddElement() {
            List<Integer> list = new ArrayList<>();
             ListManager.addElement(list, 5);
            assertEquals(1, list.size());
        }

        @Test
        public void testRemoveElement() {
            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(10);
            ListManager.removeElement(list, 1);
            assertEquals(1, list.size());
        }

        @Test
        public void testGetSize() {
            List<Integer> list = new ArrayList<>();
            assertEquals(0, ListManager.getSize(list));
            list.add(5);
            list.add(10);
            assertEquals(2, ListManager.getSize(list));
         }
    }

