package org.example.Day03.bufferdstreams;

import java.io.*;

public class FileCopyBuffered {
    public void copyFile(String sourceFilePath, String destinationFilePath) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(sourceFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destinationFilePath));

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}