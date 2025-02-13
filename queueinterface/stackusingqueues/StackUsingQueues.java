package org.example.Day02.queueinterface.stackusingqueues;

import java.util.*;

public class StackUsingQueues {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        if (queue1.isEmpty()) throw new IllegalStateException("Stack is empty ");
        return queue1.poll();
    }

    public int top() {
        if (queue1.isEmpty()) throw new IllegalStateException("Stack is empty ");
        return queue1.peek();
    }
}
