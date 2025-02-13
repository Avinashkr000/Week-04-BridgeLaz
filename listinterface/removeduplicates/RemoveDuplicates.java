package org.example.Day02.listinterface.removeduplicates;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates {
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new LinkedHashSet<>();
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (seen.add(element)) {
                result.add(element);
            }
        }
        return result;
    }
}