package com.examples;

import java.util.*;

public class StringArraySorting {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "pear", "kiwi", "orange"};
        Map<String, Integer> hashMap = new HashMap<>();
        for (String arr1 : arr) {
            hashMap.put(arr1, arr1.length());
        }
        List<KeyValuePair> sortedList = new ArrayList<>();
        for(Map.Entry<String,Integer> keyValues: hashMap.entrySet()){
            sortedList.add(new KeyValuePair(keyValues.getKey(),keyValues.getValue()));
        }

        Collections.sort(sortedList,new ValueComparator());

        for(KeyValuePair keyValues: sortedList){
            System.out.println(keyValues.length +""+keyValues.str);
        }


    }
        static class KeyValuePair {
            int length;
            String str;

            public KeyValuePair(String str, int length) {
                this.str = str;
                this.length = length;
            }


        }
        static class ValueComparator implements  Comparator<KeyValuePair>{

            @Override
            public int compare(KeyValuePair o1, KeyValuePair o2) {
                return -Integer.compare(o1.length,o2.length);
            }
        }
    }


