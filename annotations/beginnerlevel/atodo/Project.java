package org.example.Day06.annotations.beginnerlevel.atodo;

class Project {
    @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void taskOne() {
        System.out.println("Login feature task");
    }

    @Todo(task = "Create user profile page", assignedTo = "Bob")
    public void taskTwo() {
        System.out.println("User profile page task");
    }

    @Todo(task = "Add payment gateway", assignedTo = "Charlie", priority = "LOW")
    public void taskThree() {
        System.out.println("Payment gateway task");
    }
}