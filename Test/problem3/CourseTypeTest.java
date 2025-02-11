package org.example.Day01.problem3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class MainTest {

    @Test
    void testAddAndRetrieveCourses() {
        Course<ExamCourse> examCourse = new Course<>();
        examCourse.addCourse(new ExamCourse("Mathematics"));
        examCourse.addCourse(new ExamCourse("Physics"));

        List<ExamCourse> examCourses = examCourse.getCourses();
        assertEquals(2, examCourses.size());
        assertEquals("Mathematics", examCourses.get(0).getCourseName());
        assertEquals("Physics", examCourses.get(1).getCourseName());
    }

    @Test
    void testUniversityInitializationAndDisplay() {
        Course<AssignmentCourse> assignmentCourse = new Course<>();
        assignmentCourse.addCourse(new AssignmentCourse("History"));
        assignmentCourse.addCourse(new AssignmentCourse("English"));

        Course<ResearchCourse> researchCourse = new Course<>();
        researchCourse.addCourse(new ResearchCourse("Artificial Intelligence"));
        researchCourse.addCourse(new ResearchCourse("Quantum Computing"));

        List<CourseType> allCourses = new ArrayList<>();
        allCourses.addAll(assignmentCourse.getCourses());
        allCourses.addAll(researchCourse.getCourses());

        University university = new University(allCourses);

        assertEquals(4, allCourses.size());
        assertEquals("History", allCourses.get(0).getCourseName());
        assertEquals("English", allCourses.get(1).getCourseName());
        assertEquals("Artificial Intelligence", allCourses.get(2).getCourseName());
        assertEquals("Quantum Computing", allCourses.get(3).getCourseName());
    }
}