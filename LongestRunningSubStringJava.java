package com.examples;


import java.util.HashSet;
import java.util.Set;

public class LongestRunningSubStringJava {

    public static void main(String[] args){
        System.out.print(findLongestRunningSubStrings("abcabca"));
    }

    private static String findLongestRunningSubStrings(String str1) {
        int left=0,right=0,maxLen=0;
        Set<Character> hashSet = new HashSet<>();

        for(right=0;right<str1.length();right++){
            while(hashSet.contains(str1.charAt(right))){
                hashSet.remove(str1.charAt(left));
                left++;
            }
            hashSet.add(str1.charAt(right));
            maxLen = Math.max(maxLen,right-left+1);
        }
        return str1.substring(left,left+maxLen);
    }
}
