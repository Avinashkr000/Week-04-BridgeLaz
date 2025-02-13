package org.example.Day02.queueinterface.circularbuffer;

import java.util.*;

public class CircularBuffer {
    private Queue<Integer> buffer;
    private int size;

    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new LinkedList<>();
    }

    public void insert(int element) {
        if (buffer.size() == size) {
            buffer.poll();
        }
        buffer.offer(element);
    }

    @Override
    public String toString() {
        return buffer.toString();
    }
}

