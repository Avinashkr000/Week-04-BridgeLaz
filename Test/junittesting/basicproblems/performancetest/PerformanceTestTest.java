package org.example.Day05.junittesting.basicproblems.performancetest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerformanceTestTest {

    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
        void testLongRunningTask() throws InterruptedException {
        String result = PerformanceTest.longRunningTask();
        assertEquals("Completed", result);
    }
}
