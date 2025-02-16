package org.example.Day05.junittesting.basicproblems.performancetest;

import java.util.concurrent.TimeUnit;

public class PerformanceTest {
    public static String longRunningTask() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        return "Completed";
    }
}
