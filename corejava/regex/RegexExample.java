package com.example.corejava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String input = "My phone number is 123-456-7890";
        Pattern pattern = Pattern.compile("\d{3}-\d{3}-\d{4}");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("Found a phone number: " + matcher.group());
        } else {
            System.out.println("No phone number found.");
        }
    }
}