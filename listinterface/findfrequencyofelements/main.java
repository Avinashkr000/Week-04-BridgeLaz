package org.example.Day02.listinterface.findfrequencyofelements;

import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "apple", "orange");
        Map<String, Integer> result = FrequencyCounter.countFrequency(list);
        System.out.println(result);
    }
}
