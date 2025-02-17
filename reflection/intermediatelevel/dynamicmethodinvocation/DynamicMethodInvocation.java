package org.example.Day06.reflection.intermediatelevel.dynamicmethodinvocation;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        MathOperations mathOperations = new MathOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter operation (add, subtract, multiply): ");
        String operation = scanner.next();

        Method method = MathOperations.class.getMethod(operation, int.class, int.class);
        int result = (int) method.invoke(mathOperations, num1, num2);

        System.out.println("Result: " + result);
    }
}