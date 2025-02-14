package org.example.Day04.trywithresources;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class TryWithResourcesTest {

    @Test
    void testFileContentReadSuccessfully() throws IOException {

        Path tempFile = Files.createTempFile("testFile", ".txt");
        Files.writeString(tempFile, "Test content");


        try (BufferedReader br = new BufferedReader(new FileReader(tempFile.toFile()))) {
            assertEquals("Test content", br.readLine());
        }


        Files.deleteIfExists(tempFile);
    }

    @Test
    void testFileNotFound() {

        Exception exception = assertThrows(IOException.class, () -> {
            BufferedReader br = new BufferedReader(new FileReader("nonexistentfile.txt"));
            br.readLine();
        });
        assertTrue(exception.getMessage().contains("nonexistentfile"));
    }
}