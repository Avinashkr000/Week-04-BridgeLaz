package org.example.Day06.reflection.basiclevel.dynamicallycreateobjects;


import java.lang.reflect.Constructor;

public class ReflectionTest {
    public static void main(String[] args) {
        try {
            Class<?> studentClass = Class.forName("org.example.Day06.reflection.basiclevel.dynamicallycreateobjects.Student");

            Constructor<?> constructor = studentClass.getConstructor(String.class, int.class);
            Object studentInstance = constructor.newInstance("John Doe", 21);

            studentClass.getMethod("displayInfo").invoke(studentInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

