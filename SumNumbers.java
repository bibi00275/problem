package com.examples;

public class SumNumbers {

    public static void main(String[] args){
        int sum =0;
        int[] arr1={1,23,4,4,6};
        for(int i=0;i<arr1.length;i++){
            sum = sum + arr1[i];
        }
        System.out.println(sum);
    }
}
