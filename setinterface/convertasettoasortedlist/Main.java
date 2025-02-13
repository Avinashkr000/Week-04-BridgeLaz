package org.example.Day02.setinterface.convertasettoasortedlist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(5);
        integerSet.add(3);
        integerSet.add(9);
        integerSet.add(1);

        List<Integer> sortedList = SortedList.convertSetToSortedList(integerSet);
        System.out.println("Sorted List : " + sortedList);
    }
}
