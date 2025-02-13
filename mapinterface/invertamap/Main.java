package org.example.Day02.mapinterface.invertamap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, List<String>> invertedMap = InvertMap.invert(map);
        System.out.println(invertedMap);
    }
}
