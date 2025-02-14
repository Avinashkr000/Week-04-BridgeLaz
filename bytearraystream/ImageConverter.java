package org.example.Day03.bytearraystream;

import java.io.*;

public class ImageConverter {

    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        File imageFile = new File(imagePath);
        try (FileInputStream fileInputStream = new FileInputStream(imageFile);
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, bytesRead);
            }
            return byteArrayOutputStream.toByteArray();
        }
    }

    public static void writeByteArrayToImage(byte[] imageData, String outputImagePath) throws IOException {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageData);
             FileOutputStream fileOutputStream = new FileOutputStream(outputImagePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = byteArrayInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
        }
    }
}

