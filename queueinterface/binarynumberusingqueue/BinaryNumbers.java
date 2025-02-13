package org.example.Day02.queueinterface.binarynumberusingqueue;

import java.util.*;

public class BinaryNumbers {

    public static List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) return result;

        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        while (result.size() < n) {
            String current = queue.poll();
            result.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }
}
