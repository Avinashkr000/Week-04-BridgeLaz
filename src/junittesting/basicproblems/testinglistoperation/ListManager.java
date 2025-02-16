package org.example.Day05.junittesting.basicproblems.testinglistoperation;

import java.util.List;
public class ListManager {
   public static void addElement(List<Integer> list, int element) {
        if (list != null) {
            list.add(element);
        }
    }
    public static int removeElement(List<Integer> list, int element) {
        if (list != null) {
            return list.remove(element);
        }
        return -1;
    } public static int getSize(List<Integer> list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}

