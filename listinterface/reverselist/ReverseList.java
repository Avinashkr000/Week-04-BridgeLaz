package org.example.Day02.listinterface.reverselist;

import java.util.List;

public class ReverseList {
    public static <T> void reverseList(List<T> list) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            T temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}
