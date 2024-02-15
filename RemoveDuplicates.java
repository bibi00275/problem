package com.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('a');
        characters.add('b');
        characters.add('c');
        characters.add('a');
        characters.add('b');
        characters.add('c');
        removeDuplicates(characters);
    }

    private static void removeDuplicates(ArrayList<Character> numbers) {
        Set<Character> uniqueNumbers = new HashSet<>(numbers);
        System.out.println(uniqueNumbers);
//        StringBuilder strbuilder= new StringBuilder();
//        for(Character chr: uniqueNumbers){
//                strbuilder.append(chr);
//        }
//        System.out.println(strbuilder.toString());
    }
}
