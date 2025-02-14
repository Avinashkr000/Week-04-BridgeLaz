package org.example.Day03.filestreams;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "E:\\cppp\\Input.txt";
        String outputFilePath = "E:\\cppp\\Output.txt";
        FileConverter converter = new FileConverter();

        try {
            converter.convertFileToLowercase(inputFilePath, outputFilePath);
            System.out.println("File has been converted to lowercase and saved as " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}

