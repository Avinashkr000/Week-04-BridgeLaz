package org.example.Day06.annotations.beginnerlevel.markimportantmethods;


import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
        Method[] methods = taskManager.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + annotation.level());
            }
        }
    }
}