package org.example.Day01.problem3;


import java.util.List;

class University {
    private List<? extends CourseType> courses;

    public University(List<CourseType> courses) {
        this.courses = courses;
    }

    public void displayCourses() {
        for (CourseType course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}