package com.examples;

import java.util.HashSet;
import java.util.Set;

public class CommonCharactersInHashSet {



    public static void main(String[] args) {
        String[] strs = {"bella", "label", "roller","leabc"};
        Set<Character> commonChars = findCommonCharacter(strs);
        System.out.println("Common characters: " + commonChars); // Output: [l, e]
    }

    private static Set<Character> findCommonCharacters(String[] strs) {

        Set<Character> commonCharacter = new HashSet<>();

        for(Character ch: strs[0].toCharArray()){
            commonCharacter.add(ch);
        }

        for(int i=1;i<strs.length;i++){
            Set<Character> currentCharacters = new HashSet<>();
            for(Character chr: strs[i].toCharArray()){
                currentCharacters.add(chr);
            }
            commonCharacter.retainAll(currentCharacters);

        }
    return commonCharacter;
    }


    private static Set<Character> findCommonCharacter(String[] strs){

        Set<Character> commonCharacter=new HashSet<>();

        for(Character ch: strs[0].toCharArray()){
            commonCharacter.add(ch);
        }

        for(int i=1;i<strs.length;i++){
            Set<Character> currentCharacters=new HashSet<>();
            for(Character ch: strs[i].toCharArray()){
                currentCharacters.add(ch);
            }
            commonCharacter.retainAll(currentCharacters);
        }
        return commonCharacter;
    }
}
