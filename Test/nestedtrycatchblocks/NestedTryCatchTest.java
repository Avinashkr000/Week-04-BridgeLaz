package org.example.Day04.nestedtrycatchblocks;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class NestedTryCatchTest {

    @Test
    void testDivisionByZero() {
        String input = "2\n0\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        NestedTryCatch.main(new String[]{});

        assertTrue(outputStream.toString().contains("Cannot divide by zero!"));
    }

    @Test
    void testInvalidArrayIndex() {
        String input = "10\n2\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        NestedTryCatch.main(new String[]{});

        assertTrue(outputStream.toString().contains("Invalid array index!"));
    }

    @Test
    void testValidInput() {
        String input = "2\n2\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        NestedTryCatch.main(new String[]{});

        assertTrue(outputStream.toString().contains("Result: 15"));
    }
}