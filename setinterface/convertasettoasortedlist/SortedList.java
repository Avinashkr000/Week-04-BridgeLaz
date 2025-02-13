package org.example.Day02.setinterface.convertasettoasortedlist;

import java.util.*;

public class SortedList {

    public static List<Integer> convertSetToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }
}
