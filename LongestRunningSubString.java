package com.examples;

import java.util.HashSet;
import java.util.Set;

public class LongestRunningSubString {
    public static void main(String[] args){
        String str= "abcabcde";
        System.out.println(findLongestRunningSubString(str));
        
    }

    private static String findLongestRunningSubString(String str) {

        int left=0,right=0;
        int maxLen = 0;
        Set<Character> hashSet = new HashSet<>();

         for(right=0;right<str.length();right++){
             char chr = str.charAt(right);
             while(hashSet.contains(chr)){
                 hashSet.remove(str.charAt(left));
                 left++;
             }
             hashSet.add(str.charAt(right));
             maxLen = Math.max(maxLen,right-left+1);
         }
        return str.substring(left, left + maxLen);
    }

}
