package org.example.Day06.reflection.basiclevel.invokeprivatemethod;

import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true);

            int result = (int) multiplyMethod.invoke(calculator, 5, 10);
            System.out.println("Result of multiplication: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

