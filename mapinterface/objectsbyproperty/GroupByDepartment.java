package org.example.Day02.mapinterface.objectsbyproperty;

import java.util.*;
public class GroupByDepartment {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedMap = new HashMap<>();

        for (Employee employee : employees) {
            String department = employee.getDepartment();
            groupedMap.computeIfAbsent(department, k -> new ArrayList<>()).add(employee);
        }

        return groupedMap;
    }
}