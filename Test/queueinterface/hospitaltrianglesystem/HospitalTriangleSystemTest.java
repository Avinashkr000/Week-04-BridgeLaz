package org.example.Day02.queueinterface.hospitaltrianglesystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Comparator;

import org.example.Day02.queueinterface.hospitaltrianglesystem.HospitalTriangleSystem;

class HospitalTriangleSystemTest {

    @Test
    void testPatientQueueOrderingBySeverity() {
        PriorityQueue<HospitalTriangleSystem.Patient> hospitalQueue =
                new PriorityQueue<>(Comparator.comparingInt((HospitalTriangleSystem.Patient p) -> -p.severity));

        hospitalQueue.add(new HospitalTriangleSystem.Patient("John", 3));
        hospitalQueue.add(new HospitalTriangleSystem.Patient("Alice", 5));
        hospitalQueue.add(new HospitalTriangleSystem.Patient("Bob", 2));

        assertEquals("Alice", hospitalQueue.poll().name);
        assertEquals("John", hospitalQueue.poll().name);
        assertEquals("Bob", hospitalQueue.poll().name);
    }

    @Test
    void testPatientQueueWithDuplicateSeverity() {
        PriorityQueue<HospitalTriangleSystem.Patient> hospitalQueue =
                new PriorityQueue<>(Comparator.comparingInt((HospitalTriangleSystem.Patient p) -> -p.severity));

        hospitalQueue.add(new HospitalTriangleSystem.Patient("John", 3));
        hospitalQueue.add(new HospitalTriangleSystem.Patient("Alice", 3));
        hospitalQueue.add(new HospitalTriangleSystem.Patient("Bob", 2));

        assertEquals("John", hospitalQueue.poll().name); // FIFO for same severity
        assertEquals("Alice", hospitalQueue.poll().name); // FIFO for same severity
        assertEquals("Bob", hospitalQueue.poll().name);
    }
}