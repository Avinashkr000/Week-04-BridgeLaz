package org.example.Day02.mapinterface.keywithheighestvalue;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);
        String keyWithMaxValue = MaxValueKey.findKeyWithMaxValue(map);
        System.out.println(keyWithMaxValue);
    }
}
