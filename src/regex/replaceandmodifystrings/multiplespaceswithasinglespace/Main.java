package org.example.Day05.regex.replaceandmodifystrings.multiplespaceswithasinglespace;

public class Main {
    public static void main(String[] args) {
        String text = "This is an     example    with   multiple  spaces.";
        System.out.println(MultipleSpaces.replaceMultipleSpaces(text));
    }
}
