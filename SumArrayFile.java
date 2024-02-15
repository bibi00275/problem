package com.examples;

import java.util.HashSet;
import java.util.Set;

public class SumArrayFile {
    public static void main(String[] args){
        int[] scores = {75, 88, 92, 2, 8, 3, 7, 0, 10};
        int target = 10;
        findSumArray(scores,target);
    }

    private static void findSumArray(int[] scores, int target) {
        Set<Integer> seen= new HashSet<>();

        for(Integer num: scores){
            int complement = target-num;
            if(seen.contains(complement)){
                System.out.println(num+"&"+complement);
            }
            seen.add(num);
        }

    }
}
