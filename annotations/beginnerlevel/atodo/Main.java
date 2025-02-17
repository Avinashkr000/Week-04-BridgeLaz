package org.example.Day06.annotations.beginnerlevel.atodo;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Project project = new Project();
        Method[] methods = project.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println();
            }
        }
    }
}