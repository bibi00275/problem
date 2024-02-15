package com.examples;

public class MakeAnagramsScript {

    public static int minCharsToRemove(String str1, String str2) {

        int[] array1 = new int[26];
        int[] array2 = new int[26];

        for (Character chr : str1.toCharArray()) {
            array1[chr - 'a']++;
        }

        for (Character chr : str2.toCharArray()) {
            array2[chr - 'a']++;
        }

        int deletions = 0;
        for (int i = 0; i < 26; i++) {
            deletions += Math.abs(array1[i] - array2[i]);
        }
        return deletions;
    }



    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "abc";

        int minChars = minCharsToRemove(str1, str2);

        System.out.println("Minimum characters to remove: " + minChars);  // Output: 3
    }
}