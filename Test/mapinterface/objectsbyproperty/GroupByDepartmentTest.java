package org.example.Day02.mapinterface.objectsbyproperty;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;

class GroupByDepartmentTest {
    @Test
    void testGroupByDepartment() {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"),
                new Employee("Dana", "IT"),
                new Employee("Eve", "Marketing")
        );


        Map<String, List<Employee>> groupedMap = GroupByDepartment.groupByDepartment(employees);


        assertEquals(3, groupedMap.size());
        assertTrue(groupedMap.containsKey("HR"));
        assertTrue(groupedMap.containsKey("IT"));
        assertTrue(groupedMap.containsKey("Marketing"));
        assertEquals(2, groupedMap.get("HR").size());
        assertEquals(2, groupedMap.get("IT").size());
        assertEquals(1, groupedMap.get("Marketing").size());
    }
}