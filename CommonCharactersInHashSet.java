package com.examples;

import java.util.HashSet;
import java.util.Set;

public class CommonCharactersInHashSet {
    public static void main(String[] args) {
        String[] strs = {"bella", "label", "roller", "leabc"};
        Set<Character> commonChars = findCommonCharacters(strs);
        System.out.println("Common characters: " + commonChars); // Output: [e, l]
    }

    private static Set<Character> findCommonCharacters(String[] strs) {
        // Handle edge cases
        if (strs == null || strs.length == 0) {
            return new HashSet<>();
        }
        if (strs.length == 1) {
            Set<Character> result = new HashSet<>();
            for (char c : strs[0].toCharArray()) {
                result.add(c);
            }
            return result;
        }

        // Initialize with first string's characters
        Set<Character> commonCharacters = new HashSet<>();
        for (char ch : strs[0].toCharArray()) {
            commonCharacters.add(ch);
        }

        // Intersect with each subsequent string
        for (int i = 1; i < strs.length; i++) {
            Set<Character> currentCharacters = new HashSet<>();
            for (char ch : strs[i].toCharArray()) {
                currentCharacters.add(ch);
            }
            commonCharacters.retainAll(currentCharacters);
        }

        return commonCharacters;
    }
}
