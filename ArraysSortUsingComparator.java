package com.examples;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortUsingComparator {

    public static void main(String[] args){
        String[] arr = {"applddde", "banandddda", "pdddddddear", "kiwdddi", "oraddge"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });
        for(String array: arr){
            System.out.println(array);
        }
    }

}
