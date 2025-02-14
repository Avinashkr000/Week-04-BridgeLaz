package org.example.Day04.checkedexception;

import java.util.*;
import java.io.*;

public class FileProcessor {
    public void readFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}