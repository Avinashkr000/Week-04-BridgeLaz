package org.example.Day03.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {

    public static void serializeEmployees(List<Employee> employees, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(employees);
            System.out.println("Employees have been serialized to the file: " + filename);
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }

    public static List<Employee> deserializeEmployees(String filename) {
        List<Employee> employees = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            employees = (List<Employee>) in.readObject();
        } catch (IOException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found during deserialization: " + e.getMessage());
        }
        return employees;
    }
}
