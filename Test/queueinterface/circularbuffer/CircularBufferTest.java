package org.example.Day02.queueinterface.circularbuffer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferTest {

    private CircularBuffer circularBuffer;

    @BeforeEach
    public void setUp() {
        circularBuffer = new CircularBuffer(3);
    }

    @Test
    public void testInsertAndDisplay() {
        circularBuffer.insert(1);
        circularBuffer.insert(2);
        circularBuffer.insert(3);
        assertEquals("[1, 2, 3]", circularBuffer.toString());

        circularBuffer.insert(4);
        assertEquals("[2, 3, 4]", circularBuffer.toString());

        circularBuffer.insert(5);
        assertEquals("[3, 4, 5]", circularBuffer.toString());
    }

    @Test
    public void testInsertWhenBufferIsEmpty() {
        circularBuffer.insert(1);
        assertEquals("[1]", circularBuffer.toString());
    }

    @Test
    public void testInsertWhenBufferHasOneElement() {
        circularBuffer.insert(1);
        circularBuffer.insert(2);
        assertEquals("[1, 2]", circularBuffer.toString());
    }

    @Test
    public void testInsertWhenBufferIsFull() {
        circularBuffer.insert(1);
        circularBuffer.insert(2);
        circularBuffer.insert(3);
        assertEquals("[1, 2, 3]", circularBuffer.toString());

        circularBuffer.insert(4);
        assertEquals("[2, 3, 4]", circularBuffer.toString());
    }
}
