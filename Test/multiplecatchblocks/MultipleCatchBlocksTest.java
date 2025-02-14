package org.example.Day04.multiplecatchblocks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MultipleCatchBlocksTest {

    @Test
    void testNullPointerExceptionHandling() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MultipleCatchBlocks.main(new String[]{});


        String output = outputStream.toString().trim();
        assertEquals("Array is not initialized!", output);
    }

    @Test
    void testArrayIndexOutOfBoundsExceptionHandling() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        try {
            int[] arr = new int[3];
            int invalidIndex = 10; // Out of bounds
            System.out.println(arr[invalidIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }


        String output = outputStream.toString().trim();
        assertEquals("Invalid index!", output);
    }
}