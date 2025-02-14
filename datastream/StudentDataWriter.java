package org.example.Day03.datastream;

import java.io.*;

public class StudentDataWriter {
    public static void writeStudentData(String fileName, Student student) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            dataOutputStream.writeInt(student.getRollNumber());
            dataOutputStream.writeUTF(student.getName());
            dataOutputStream.writeDouble(student.getGpa());
        }
    }
}
