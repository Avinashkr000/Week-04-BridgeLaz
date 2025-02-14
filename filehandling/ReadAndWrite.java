package org.example.Day03.filehandling;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {
    public void copyFile(String sourceFilePath, String destinationFilePath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File sourceFile = new File(sourceFilePath);
            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }
            fis = new FileInputStream(sourceFile);

            File destinationFile = new File(destinationFilePath);
            if (!destinationFile.exists()) {
                destinationFile.createNewFile();
            }
            fos = new FileOutputStream(destinationFile);

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File content copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred during file handling: " + e.getMessage());
        }

    }
}
