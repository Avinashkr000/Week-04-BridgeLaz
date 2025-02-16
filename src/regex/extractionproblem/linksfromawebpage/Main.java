package org.example.Day05.regex.extractionproblem.linksfromawebpage;

public class Main {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        System.out.println(ExtractLinksFromAwebPage.extractLinks(text));
    }
}
