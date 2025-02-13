package org.example.Day02.mapinterface.mergetwomaps;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        Map<String, Integer> mergedMap = MergeMaps.merge(map1, map2);
        System.out.println(mergedMap);
    }
}
