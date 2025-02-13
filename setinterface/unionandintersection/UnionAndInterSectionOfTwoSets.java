package org.example.Day02.setinterface.unionandintersection;

import java.util.HashSet;
import java.util.Set;

public class UnionAndInterSectionOfTwoSets {
    public static Set<Integer> computeUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }


    public static Set<Integer> computeIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}
