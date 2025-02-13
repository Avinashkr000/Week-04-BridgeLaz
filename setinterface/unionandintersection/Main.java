package org.example.Day02.setinterface.unionandintersection;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3);

        Set<Integer> set2 = Set.of(3, 4, 5);

        Set<Integer> union = UnionAndInterSectionOfTwoSets.computeUnion(set1, set2);
        Set<Integer> intersection = UnionAndInterSectionOfTwoSets.computeIntersection(set1, set2);

        System.out.println("Union : " + union);
        System.out.println("Intersection : " + intersection);
    }
}
