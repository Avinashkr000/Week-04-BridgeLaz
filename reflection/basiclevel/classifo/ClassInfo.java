package org.example.Day06.reflection.basiclevel.classifo;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No class name provided. Using default class: java.lang.String");
            args = new String[]{"java.lang.String"};
        }
        try {
            Class<?> clazz = Class.forName(args[0]);
            System.out.println("Class: " + clazz.getName());

            System.out.println("\nMethods:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }

            System.out.println("\nFields:");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
            }

            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor.getName());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}
