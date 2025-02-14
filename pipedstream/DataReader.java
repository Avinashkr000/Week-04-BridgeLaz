package org.example.Day03.pipedstream;

import java.io.*;

public class DataReader extends Thread {
    private PipedInputStream pipedInputStream;

    public DataReader(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        try {
            int data;
            while ((data = pipedInputStream.read()) != -1) {
                System.out.print((char) data);
            }
            pipedInputStream.close();
        } catch (IOException e) {
            System.out.println("Error in DataReader: " + e.getMessage());
        }
    }
}

