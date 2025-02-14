package org.example.Day02.queueinterface.stackusingqueues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackUsingQueuesTest {

    private StackUsingQueues stack;

    @BeforeEach
    void setUp() {
        stack = new StackUsingQueues();
    }

    @Test
    void testPushAndTop() {
        stack.push(1);
        assertEquals(1, stack.top(), "Top element should be 1");

        stack.push(2);
        assertEquals(2, stack.top(), "Top element should be 2");

        stack.push(3);
        assertEquals(3, stack.top(), "Top element should be 3");
    }

    @Test
    void testPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop(), "Popped element should be 3");
        assertEquals(2, stack.top(), "Top element after popping should be 2");

        assertEquals(2, stack.pop(), "Popped element should be 2");
        assertEquals(1, stack.top(), "Top element after popping should be 1");

        assertEquals(1, stack.pop(), "Popped element should be 1");
        assertThrows(IllegalStateException.class, stack::pop, "Popping from empty stack should throw exception");
    }

    @Test
    void testTopOnEmptyStack() {
        assertThrows(IllegalStateException.class, stack::top, "Top on empty stack should throw exception");
    }

    @Test
    void testPopOnEmptyStack() {
        assertThrows(IllegalStateException.class, stack::pop, "Pop on empty stack should throw exception");
    }

    @Test
    void testStackOrder() {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop(), "Popped element should be 30");
        assertEquals(20, stack.pop(), "Popped element should be 20");
        assertEquals(10, stack.pop(), "Popped element should be 10");
    }
}
