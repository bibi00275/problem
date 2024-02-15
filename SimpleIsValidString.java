package com.examples;

public class SimpleIsValidString {

    public static boolean isPossibleValidString(String s) {
        int numUpper = 0;
        int numLower = 0;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                numUpper++;
            } else {
                numLower++;
            }
        }

        // Check if both cases are present and differ by at most 1
        return Math.abs(numUpper - numLower) <= 1;
    }

    public static void main(String[] args) {
        String str1 = "Ab1Z";
        String str2 = "aBc";
        String str3 = "AaA";
        String str4 = "ab1Z";

        System.out.println(isPossibleValidString(str1)); // True
        System.out.println(isPossibleValidString(str2)); // True
        System.out.println(isPossibleValidString(str3)); // False
        System.out.println(isPossibleValidString(str4)); // False
    }
}