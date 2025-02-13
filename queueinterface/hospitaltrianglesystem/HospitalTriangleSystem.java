package org.example.Day02.queueinterface.hospitaltrianglesystem;

import java.util.PriorityQueue;
import java.util.Comparator;

public class HospitalTriangleSystem {

    static class Patient {
        String name;
        int severity;

        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }
}
