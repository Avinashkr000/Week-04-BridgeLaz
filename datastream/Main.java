package org.example.Day03.datastream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "E:\\cppp\\StudentDetail.txt";
        Student student = new Student(21, "Avinash kumar", 8.17);

        try {
            StudentDataWriter.writeStudentData(fileName, student);
            Student retrievedStudent = StudentDataReader.readStudentData(fileName);
            System.out.println("Roll Number: " + retrievedStudent.getRollNumber());
            System.out.println("Name: " + retrievedStudent.getName());
            System.out.println("GPA: " + retrievedStudent.getGpa());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}