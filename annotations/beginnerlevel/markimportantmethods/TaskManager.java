package org.example.Day06.annotations.beginnerlevel.markimportantmethods;

class TaskManager {
    @ImportantMethod(level = "LOW")
    public void taskOne() {
        System.out.println("Task One");
    }

    @ImportantMethod(level = "HIGH")
    public void taskTwo() {
        System.out.println("Task Two");
    }

    public void taskThree() {
        System.out.println("Task Three");
    }
}