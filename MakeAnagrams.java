package com.examples;

public class MakeAnagrams {

    public static int minCharsToRemove(String str1, String str2) {

        if(str1.isEmpty() || str2.isEmpty()){
            throw new IllegalArgumentException("String1 and String 2 cannot be empty");
        }
        // Create frequency arrays for both strings
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char c : str1.toCharArray()) {
            count1[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            count2[c - 'a']++;
        }
        int deletions = 0;
        for (int i = 0; i < 26; i++) {
            deletions += Math.abs(count1[i] - count2[i]);
        }
        System.out.println(deletions);
        return  deletions;
    }



    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "abc";

        int minChars = minCharsToRemove(str1, str2);

        System.out.println("Minimum characters to remove: " + minChars);  // Output: 3
    }
}