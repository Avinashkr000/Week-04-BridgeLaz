package org.example.Day04.exceptionpropagationinmethods;

public class Propagation {

    public static void method1() {
        throw new ArithmeticException("Exception occurred: division by zero");
    }

    public static void method2() {
        method1();
    }
}

