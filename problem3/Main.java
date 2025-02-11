package org.example.Day01.problem3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course<ExamCourse> examCourse = new Course<>();
        examCourse.addCourse(new ExamCourse("Mathematics"));
        examCourse.addCourse(new ExamCourse("Physics"));

        Course<AssignmentCourse> assignmentCourse = new Course<>();
        assignmentCourse.addCourse(new AssignmentCourse("History"));
        assignmentCourse.addCourse(new AssignmentCourse("English"));

        Course<ResearchCourse> researchCourse = new Course<>();
        researchCourse.addCourse(new ResearchCourse("Artificial Intelligence"));
        researchCourse.addCourse(new ResearchCourse("Quantum Computing"));

        List<CourseType> allCourses = new ArrayList<>();
        allCourses.addAll(examCourse.getCourses());
        allCourses.addAll(assignmentCourse.getCourses());
        allCourses.addAll(researchCourse.getCourses());

        University university = new University(allCourses);
        university.displayCourses();
    }
}
