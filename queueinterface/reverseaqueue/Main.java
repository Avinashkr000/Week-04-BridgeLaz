package org.example.Day02.queueinterface.reverseaqueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);

        ReverseAQueue.reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}
