package org.example.Day04.uncheckedexception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class UncheckedExceptionTest {

    @Test
    void testDivisionByZero() {
        ByteArrayInputStream in = new ByteArrayInputStream("10\n0\n".getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        UncheckedException.main(new String[]{});

        assertTrue(out.toString().contains("Error: Division by zero is not allowed."));
    }

    @Test
    void testNonNumericInput() {
        ByteArrayInputStream in = new ByteArrayInputStream("10\na\n".getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        UncheckedException.main(new String[]{});

        assertTrue(out.toString().contains("Error: Please enter numeric values only."));
    }

    @Test
    void testValidDivision() {
        ByteArrayInputStream in = new ByteArrayInputStream("10\n2\n".getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        UncheckedException.main(new String[]{});

        assertTrue(out.toString().contains("Result: 5"));
    }
}