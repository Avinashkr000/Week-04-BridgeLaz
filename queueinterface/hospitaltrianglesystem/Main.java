package org.example.Day02.queueinterface.hospitaltrianglesystem;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<HospitalTriangleSystem.Patient> hospitalQueue = new PriorityQueue<>(Comparator.comparingInt((HospitalTriangleSystem.Patient p) -> -p.severity));

        hospitalQueue.add(new HospitalTriangleSystem.Patient("John", 3));
        hospitalQueue.add(new HospitalTriangleSystem.Patient("Alice", 5));
        hospitalQueue.add(new HospitalTriangleSystem.Patient("Bob", 2));

        while (!hospitalQueue.isEmpty()) {
            HospitalTriangleSystem.Patient patient = hospitalQueue.poll();
            System.out.println("patient : " + patient.name + patient.severity);
        }
    }
}
