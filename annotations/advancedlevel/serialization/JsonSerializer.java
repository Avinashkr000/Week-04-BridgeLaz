package org.example.Day06.annotations.advancedlevel.serialization;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {
    public static String toJson(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Map<String, String> jsonMap = new HashMap<>();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField jsonField = field.getAnnotation(JsonField.class);
                field.setAccessible(true);
                String jsonKey = jsonField.name();
                String jsonValue = String.valueOf(field.get(obj));
                jsonMap.put(jsonKey, jsonValue);
            }
        }

        StringBuilder json = new StringBuilder("{");
        for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
            json.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
        }

        if (!jsonMap.isEmpty()) {
            json.delete(json.length() - 2, json.length());  // Remove trailing comma
        }

        json.append("}");
        return json.toString();
    }
}
