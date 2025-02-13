package org.example.Day02.mapinterface.mergetwomaps;

import java.util.*;

public class MergeMaps {
    public static Map<String, Integer> merge(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            mergedMap.put(key, mergedMap.getOrDefault(key, 0) + value);
        }

        return mergedMap;
    }
}
