package org.example.Day03.pipedstream;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);

            DataWriter writer = new DataWriter(pipedOutputStream);
            DataReader reader = new DataReader(pipedInputStream);

            writer.start();
            reader.start();

            writer.join();
            reader.join();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

