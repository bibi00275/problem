package com.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class CommonCharactersWithHashSet {

        public static Set<Character> findCommonCharacters(String[] strs) {
            Set<Character> commonChars = new HashSet<>();

            // Iterate through each character in the first string
            for (char c : strs[0].toCharArray()) {
                commonChars.add(c); // Add all characters initially
            }

            // Iterate through the remaining strings
            for (int i = 1; i < strs.length; i++) {
                Set<Character> currentChars = new HashSet<>();
                for (char c : strs[i].toCharArray()) {
                    currentChars.add(c);
                }
                //abel and relo
                // Retain only the characters present in both sets
                commonChars.retainAll(currentChars);
            }


            return commonChars;
        }

        public static void main(String[] args) {
            String[] strs = {"bella", "label", "roller","leabc"};
            Set<Character> commonChars = findCommonCharacters(strs);
            System.out.println("Common characters: " + commonChars); // Output: [l, e]
        }
    }