package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumPairFile {
    public static void main(String[] args) {
        int[] scores = {75, 88, 92,2,8,3,7,0,10 };
        List<List<Integer>> list1=findPairSum(scores,10);
        System.out.println(list1);

    }

    public static List<List<Integer>> findPairSum(int[] arr, int target) {
        List<List<Integer>> pairs = new ArrayList<>();
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                pairs.add(Arrays.asList(arr[left], arr[right]));
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return pairs;
    }
}

