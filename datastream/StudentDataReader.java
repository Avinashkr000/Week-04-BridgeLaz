package org.example.Day03.datastream;

import java.io.*;

public class StudentDataReader {
    public static Student readStudentData(String fileName) throws IOException {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            int rollNumber = dataInputStream.readInt();
            String name = dataInputStream.readUTF();
            double gpa = dataInputStream.readDouble();
            return new Student(rollNumber, name, gpa);
        }
    }
}


