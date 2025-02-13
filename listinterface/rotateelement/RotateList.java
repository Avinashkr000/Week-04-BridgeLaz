package org.example.Day02.listinterface.rotateelement;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class RotateList {
    public static <T> void rotateList(List<T> list, int positions) {
        if (list == null || list.isEmpty() || positions == 0) {
            return;
        }
        int size = list.size();
        positions = positions % size;
        if (positions < 0) {
            positions += size;
        }
        Collections.rotate(list, positions);
    }
}