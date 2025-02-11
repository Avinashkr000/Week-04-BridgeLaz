package org.example.Day01.problem5;


class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public String processResume() {
        return "Processing resume for: " + jobRole.getJobDescription();
    }
}