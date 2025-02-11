package org.example.Day01.problem5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

class ResumeScreeningSystemTest {

    @Test
    void testScreenResumes() {

        List<JobRole> jobRoles = List.of(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {

            ResumeScreeningSystem.screenResumes(jobRoles);


            String output = outputStream.toString();
            assertTrue(output.contains("Processing resume for: Software Engineer Role: Requires Java, Spring Boot, and Microservices experience."));
            assertTrue(output.contains("Processing resume for: Data Scientist Role: Requires Python, Machine Learning, and Data Analytics skills."));
            assertTrue(output.contains("Processing resume for: Product Manager Role: Requires Agile methodologies, Market Research, and Leadership skills."));
        } finally {
            System.setOut(originalOut);
        }
    }
}