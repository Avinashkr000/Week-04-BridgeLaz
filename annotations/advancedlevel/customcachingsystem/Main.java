package org.example.Day06.annotations.advancedlevel.customcachingsystem;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        ExpensiveComputation computation = new ExpensiveComputation();
        Method method = computation.getClass().getMethod("computeFactorial", int.class);

        System.out.println(computation.computeFactorial(5));
        System.out.println(computation.computeFactorial(6));
        System.out.println(computation.computeFactorial(5));
    }
}
