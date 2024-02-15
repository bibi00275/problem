package com.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringLenCom {
    public static void main(String[] args){
        String[] str = {"abc", "december", "application"};
        List<String> lst = Arrays.asList(str);
        Collections.sort(lst,Comparator.comparingInt(String::length));
        for(String str1: lst){
            System.out.println(str1+":"+str1.length());
        }
    }
    static class StringLenCome implements  Comparator<String>{

        public int compare(String s1,String s2){
            return Integer.compare(s1.length(),s2.length());
        }

    }

}
