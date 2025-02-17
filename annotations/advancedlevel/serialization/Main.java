package org.example.Day06.annotations.advancedlevel.serialization;

import static org.example.Day06.annotations.advancedlevel.serialization.JsonSerializer.toJson;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("john_doe", 30);
        String json = toJson(user);
        System.out.println(json);
    }
}
