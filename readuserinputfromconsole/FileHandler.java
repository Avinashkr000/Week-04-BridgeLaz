package org.example.Day03.readuserinputfromconsole;

import java.io.*;

public class FileHandler {
    public void saveToFile(UserInfo userInfo, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(userInfo.toString());
            System.out.println("Information has been saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
