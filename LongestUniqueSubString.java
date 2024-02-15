package com.examples;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubString {

    public static void main(String[] args){
        System.out.println(longestUniqueSubstring("abcabcd"));
    }
    public static String longestUniqueSubstring(String str) {
        int n = str.length();
        int start = 0, end = 0;
        int maxLen = 0;
        Set<Character> seen = new HashSet<>();

        for (end = 0; end < n; end++) {
            char c = str.charAt(end);

            // If character already seen, move window start until character disappears
            while (seen.contains(c)) {
                seen.remove(str.charAt(start));
                start++;
            }

            seen.add(c); // Add current character to the set
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return str.substring(start, start + maxLen);
    }
}
