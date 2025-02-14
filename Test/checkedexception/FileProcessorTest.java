package org.example.Day04.checkedexception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.*;

class FileProcessorTest {

    @Test
    void testReadFileValidFile() throws IOException {

        File tempFile = File.createTempFile("testFile", ".txt");
        PrintWriter writer = new PrintWriter(tempFile);
        writer.println("Line 1");
        writer.println("Line 2");
        writer.close();

        FileProcessor processor = new FileProcessor();
        processor.readFile(tempFile.getAbsolutePath());


        tempFile.deleteOnExit();
    }

    @Test
    void testReadFileInvalidFile() {
        FileProcessor processor = new FileProcessor();
        processor.readFile("non_existent_file.txt");
    }
}