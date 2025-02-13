package org.example.Day02.setinterface.checkiftwosetsareequal;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        System.out.println("Sets are equal: " + CheckTwoSet.areEqual(set1, set2)); // Output: true
    }
}
