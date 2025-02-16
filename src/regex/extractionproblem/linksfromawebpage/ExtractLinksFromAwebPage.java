package org.example.Day05.regex.extractionproblem.linksfromawebpage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksFromAwebPage {
    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        String regex = "https?://[\\w.-]+(?:\\.[\\w.-]+)+[/\\w._~:/?#\\[\\]@!$&'()*+,;=-]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }
}
