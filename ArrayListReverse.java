package com.examples;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        reverseArrayList(numbers);
    }

    private static void reverseArrayList(ArrayList<Integer> numbers) {

        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
