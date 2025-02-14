package org.example.Day04.checkedexception;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        String fileName = "E:\\cppp\\source.txt";
        FileProcessor processor = new FileProcessor();
        processor.readFile(fileName);
    }
}
