package org.example.Day03.pipedstream;

import java.io.*;

public class DataWriter extends Thread {
    private PipedOutputStream pipedOutputStream;

    public DataWriter(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                String data = "Data " + i + "\n";
                pipedOutputStream.write(data.getBytes());
                Thread.sleep(500);
            }
            pipedOutputStream.close();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error in DataWriter: " + e.getMessage());
        }
    }
}
