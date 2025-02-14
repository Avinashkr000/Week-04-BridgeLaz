package org.example.Day03.filehandling;


public class Main {
    public static void main(String[] args) {
        ReadAndWrite fileHandler = new ReadAndWrite();
        String sourceFile = "E:\\cppp\\source.txt";
        String destinationFile = "E:\\cppp\\destination.txt";
        fileHandler.copyFile(sourceFile, destinationFile);
    }
}
