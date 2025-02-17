package org.example.Day06.annotations.intermediatelevel.logginmethodexecution;

class PerformanceTest {

    @LogExecutionTime
    public void methodOne() {
        try {
            Thread.sleep(500);  // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @LogExecutionTime
    public void methodTwo() {
        try {
            Thread.sleep(1000);  // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodThree() {
        try {
            Thread.sleep(200);  // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
