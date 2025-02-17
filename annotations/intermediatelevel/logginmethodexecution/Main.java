package org.example.Day06.annotations.intermediatelevel.logginmethodexecution;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        PerformanceTest test = new PerformanceTest();
        Method[] methods = test.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(test);
                long endTime = System.nanoTime();
                long duration = endTime - startTime;
                System.out.println("Execution time of " + method.getName() + ": " + duration + " nanoseconds");
            }
        }
    }
}