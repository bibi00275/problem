package com.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {
    public static void main(String[] args){
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);    numbers.add(2);
        numbers.add(2);
        numbers.add(3);


        printDuplicates1    (numbers);
    }

    private static void printDuplicates(ArrayList<Integer> numbers) {
        Set<Integer> duplicates = new HashSet<>();
        for(int i=0;i<numbers.size();i++){
            for(int j=i+1;j<numbers.size();j++){
                if(numbers.get(i) == numbers.get(j)){
                    duplicates.add(numbers.get(i));
                }
            }
        }
        System.out.println(duplicates);
    }



    private static void printDuplicates1(ArrayList<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        System.out.println(numbers.removeIf(n->!uniqueNumbers.add(n)));
        System.out.println(numbers);
    }
}
