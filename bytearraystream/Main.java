package org.example.Day03.bytearraystream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputImagePath = "E:\\cppp\\laptop.jpg";
        String outputImagePath = "E:\\cppp\\blank.jpg";

        try {
            byte[] imageData = ImageConverter.convertImageToByteArray(inputImagePath);
            ImageConverter.writeByteArrayToImage(imageData, outputImagePath);
            System.out.println("Image has been successfully written to: " + outputImagePath);
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
