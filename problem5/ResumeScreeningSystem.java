package org.example.Day01.problem5;


import java.util.List;

public class ResumeScreeningSystem {
    public static void screenResumes(List<? extends JobRole> jobRoles) {
        for (JobRole jobRole : jobRoles) {
            Resume<JobRole> resume = new Resume<>(jobRole);
            System.out.println(resume.processResume());
        }
    }

    public static void main(String[] args) {
        List<JobRole> jobRoles = List.of(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        screenResumes(jobRoles);
    }
}