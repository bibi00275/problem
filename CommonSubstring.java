package com.examples;

public class CommonSubstring {

    public static boolean hasCommonSubstring(String str1, String str2) {
        // Convert both strings to lowercase for case-insensitive comparison
       str1=str1.toLowerCase();
       str2=str2.toLowerCase();

       return str1.contains(str2) || str2.contains(str1);
    }

    public static void main(String[] args) {
        String str1 = "helloabc";
        String str2 = "ello";

        if (hasCommonSubstring(str1, str2)) {
            System.out.println("Strings share a common substring");
        } else {
            System.out.println("Strings don't share a common substring");
        }
    }
}
