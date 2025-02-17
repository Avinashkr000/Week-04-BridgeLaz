package org.example.Day06.reflection.advancelevel.jsonrepresentationgenerator;
public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person("John Doe", 30);
        String jsonString = JsonConverter.toJson(person);
        System.out.println(jsonString);
    }
}
