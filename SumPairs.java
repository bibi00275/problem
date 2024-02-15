package com.examples;

import java.util.HashSet;
import java.util.Set;

public class SumPairs {
    public static void main(String[] args) {

        int[] scores = {75, 88, 92, 2, 8, 3, 7, 0, 10};
        int target = 10;

        findSumPairs(scores, target);
    }

    public static void findSumPairs(int[] numbers, int target) {
        Set<Integer> seen = new HashSet<>();

        for (Integer num : numbers) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println(complement + "&" + num);
            }
            seen.add(num);
        }
    }
}
