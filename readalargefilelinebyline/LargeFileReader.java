package org.example.Day03.readalargefilelinebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeFileReader {
    public void readLargeFiles(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
