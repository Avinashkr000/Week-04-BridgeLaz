package org.example.Day04.exceptionpropagationinmethods;

public class Main {
    public static void main(String[] args) {
        try {
            Propagation.method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
