package org.example.Day02.queueinterface.binarynumberusingqueue;

import java.util.List;

public class Main {
    public static void main (String[]args){
        int n = 5;
        List<String> binaryNumbers = BinaryNumbers.generateBinaryNumbers(n);
        System.out.println(binaryNumbers);
    }
}

