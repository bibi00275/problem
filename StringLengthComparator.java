package com.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringLengthComparator {
    public static void main(String[] args) {
        String[] str = {"abc", "december", "application"};
        List<String> list = Arrays.asList(str);
        Collections.sort(list,new StringLenComparator());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+""+ list.get(i).length());
        }
    }

    static class StringLenComparator implements  Comparator<String>{
        @Override
        public int compare(String s1,String s2) {
            return Integer.compare(s1.length(),s2.length());
        }
    }
}
