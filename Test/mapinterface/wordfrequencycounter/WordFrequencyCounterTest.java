package org.example.Day02.mapinterface.wordfrequencycounter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

class WordFrequencyCounterTest {

    private File tempFile;

    @BeforeEach
    void setUp() throws IOException {
        tempFile = new File("tempInput.txt");
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write("Hello world! Hello Universe. Universe and World.");
        }
    }

    @AfterEach
    void tearDown() {
        tempFile.delete();
    }

    @Test
    void testWordFrequencyCounter() throws IOException {
        WordFrequencyCounter.main(new String[]{tempFile.getAbsolutePath()});
        Map<String, Integer> expectedFrequency = Map.of(
                "hello", 2,
                "world", 2,
                "universe", 2,
                "and", 1
        );
    }
}