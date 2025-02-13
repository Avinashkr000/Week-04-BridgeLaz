package org.example.Day02.listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> linkedList = new LinkedList<>(List.of(1, 2, 3, 4, 5));

        ReverseList.reverseList(arrayList);
        ReverseList.reverseList(linkedList);

        System.out.println("Reverse ArrayList : " + arrayList);
        System.out.println("Reverse LinkedList : " + linkedList);
    }
}
