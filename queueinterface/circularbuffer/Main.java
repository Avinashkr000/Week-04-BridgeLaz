package org.example.Day02.queueinterface.circularbuffer;

public class Main {
    public static void main(String[] args) {

        CircularBuffer circularBuffer = new CircularBuffer(3);
        circularBuffer.insert(1);
        circularBuffer.insert(2);
        circularBuffer.insert(3);
        System.out.println("Buffer after inserting 1, 2, 3: " + circularBuffer);

        circularBuffer.insert(4);
        System.out.println("Buffer after inserting 4: " + circularBuffer);


    }
}