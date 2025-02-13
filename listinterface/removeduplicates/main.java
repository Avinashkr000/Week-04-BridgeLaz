package org.example.Day02.listinterface.removeduplicates;

import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 1, 2, 2, 3, 4);
        List<Integer> result = RemoveDuplicates.removeDuplicates(list);
        System.out.println("List after removing duplicates: " + result);
    }
}
