package com.examples;

public class Palindrome {

    public static void main(String[] args) {
        String str1 = "malayalam";
        char[] chr = str1.toCharArray();
        StringBuilder str = new StringBuilder();

        for (int i = chr.length - 1; i >= 0; i--) {
            str.append(chr[i]);
        }

        // Use toString() to convert StringBuilder to String before comparison
        if (str1.equals(str.toString())) {
            System.out.println("Is Palindrome");
        }
    }
}