package org.example.Day04.finallyblockexecution;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class FinallyBlockTest {

    @Test
    void testDivisionByNonZero() {
        String input = "10\n2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        FinallyBlock.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("Result: 5"));
        assertTrue(output.contains("Operation completed."));
    }

    @Test
    void testDivisionByZero() {
        String input = "10\n0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        FinallyBlock.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("Error: Cannot divide by zero."));
        assertTrue(output.contains("Operation completed."));
    }
}