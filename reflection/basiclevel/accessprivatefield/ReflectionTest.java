package org.example.Day06.reflection.basiclevel.accessprivatefield;


import java.lang.reflect.Field;

public class ReflectionTest {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);

            int currentAge = (int) ageField.get(person);
            System.out.println("Current Age: " + currentAge);

            ageField.set(person, 30);
            int newAge = (int) ageField.get(person);
            System.out.println("Modified Age: " + newAge);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}