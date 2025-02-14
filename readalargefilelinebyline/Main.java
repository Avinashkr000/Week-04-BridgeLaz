package org.example.Day03.readalargefilelinebyline;

public class Main {
    public static void main(String[] args) {
        String fileName = "E:\\cppp\\errordoc.txt";
        LargeFileReader object=new LargeFileReader();
        object.readLargeFiles(fileName);
    }
}
