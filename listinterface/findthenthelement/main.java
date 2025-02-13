package org.example.Day02.listinterface.findthenthelement;

import java.util.*;
public class main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        String result = NthElementFromEnd.findNthFromEnd(list, n);
        System.out.println("The " + n + "th element from end is : " + result);
    }
}
