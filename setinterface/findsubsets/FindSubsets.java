package org.example.Day02.setinterface.findsubsets;

import java.util.*;

public class FindSubsets {

    public static boolean isSubset(Set<Integer> subset, Set<Integer> superset) {
        return superset.containsAll(subset);
    }
}
