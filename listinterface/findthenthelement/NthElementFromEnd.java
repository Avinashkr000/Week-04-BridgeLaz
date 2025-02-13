package org.example.Day02.listinterface.findthenthelement;
import java.util.*;

public class NthElementFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (list == null || list.isEmpty() || n <= 0) {
            throw new IllegalArgumentException("Invalid input or N is out of bounds.");
        }

        if (n > list.size()) {
            throw new IllegalArgumentException("N is greater than the size of the list.");
        }

        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                throw new IllegalArgumentException("N is greater than the size of the list.");
            }
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }
}