package org.example.Day06.annotations.advancedlevel.customcachingsystem;

import java.util.HashMap;
import java.util.Map;

class ExpensiveComputation {
    private static Map<String, Object> cache = new HashMap<>();

    @CacheResult
    public int computeFactorial(int number) {
        String key = "factorial_" + number;

        if (cache.containsKey(key)) {
            System.out.println("Returning cached result for " + number);
            return (int) cache.get(key);
        }

        System.out.println("Computing factorial for " + number);
        int result = factorial(number);
        cache.put(key, result);
        return result;
    }

    private int factorial(int number) {
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }
}
