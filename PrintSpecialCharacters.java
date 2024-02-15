package com.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintSpecialCharacters {

    public static void main(String[] args) {
        String str = "Hello, world!  This is a string with various characters.";

        // Using escape sequences
        System.out.println("Using escape sequences:");
        System.out.println("Newline: \n");
        System.out.println("Tab: \t");
        System.out.println("Smiley face: \u263A");

        // Using Character class methods
        System.out.println("\nUsing Character class methods:");
        for (char ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.print(ch + " ");
            }
        }

        // Using regular expressions
        System.out.println("\nUsing regular expressions:");
        Pattern pattern = Pattern.compile("[^\\p{L}\\p{Nd}\\s]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
