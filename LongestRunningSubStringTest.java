package com.examples;

import java.util.HashSet;
import java.util.Set;

public class LongestRunningSubStringTest {
    public static void main(String[] args){
        System.out.println(findLongestRunningCharacter("abcabcd"));
    }

    private static String findLongestRunningCharacter(String str) {

        int left=0,right=0,maxLen=0;

        Set<Character> hashSet = new HashSet<>();

        for(right=0;right<str.length();right++){

            while(hashSet.contains(str.charAt(right))){
                hashSet.remove(str.charAt(left));
                left++;
            }
            hashSet.add(str.charAt(right));
            maxLen = Math.max(maxLen,right-left+1);
        }
        return str.substring(left,left+maxLen);
    }
}
