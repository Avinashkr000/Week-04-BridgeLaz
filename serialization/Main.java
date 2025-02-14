package org.example.Day03.serialization;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename = "E:\\cppp\\employeedetail.txt";

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "HR", 50000.0));
        employees.add(new Employee(2, "Jane Smith", "Finance", 60000.0));
        employees.add(new Employee(3, "Alice Brown", "Engineering", 75000.0));

        EmployeeSerialization.serializeEmployees(employees, filename);

        List<Employee> deserializedEmployees = EmployeeSerialization.deserializeEmployees(filename);
        if (deserializedEmployees != null) {
            deserializedEmployees.forEach(System.out::println);
        }
    }
}
