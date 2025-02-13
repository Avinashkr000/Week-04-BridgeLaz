package org.example.Day02.setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static Set<Integer> computeSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        symmetricDifference.removeAll(intersection);

        return symmetricDifference;
    }
}


