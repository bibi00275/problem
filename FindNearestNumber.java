package com.examples;

import java.util.ArrayList;
import java.util.List;



public class FindNearestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 5, 10, 20));

        findNearestNumbers1(numbers, 18);
    }

    private static void findNearestNumbers(List<Integer> numbers, int target) {
        int closestElement = 0;
        int currentDifference = Integer.MAX_VALUE;
        for (Integer num : numbers) {
            int diff = Math.abs(num - target);
            if (diff < currentDifference) {
                currentDifference = diff;
                closestElement = num;
            }
        }
        System.out.println(closestElement);
    }

    private static void findNearestNumbers1(List<Integer> numbers, int target) {
       int closesElement=0;
       int currentDifference=Integer.MAX_VALUE;
       closesElement = numbers.get(0);
       if(String.valueOf(target).isEmpty()){
           throw new IllegalArgumentException("Target cannot be empty");
       }
       for(int i=1;i<numbers.size();i++){
           int diff = Math.abs(target-currentDifference);
           if(diff < currentDifference){
               currentDifference=diff;
               closesElement = numbers.get(i);
           }
       }
       System.out.println(closesElement);
    }
}
