package com.examples;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args){
        List<Integer> list1=new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> list2=new ArrayList<>(List.of(1,12,13,42,53));

        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list1.get(i)==list2.get(j)){
                   System.out.println(list1.get(i));
                }
            }
        }

//        List<Integer> numbers1 = new ArrayList<>(List.of(1,2,3,4,5,6));
//        List<Integer> numbers2= new ArrayList<>(List.of(11,2,3,2,43,52,62));
//        Set<Integer> commonNumber = new HashSet<>();
//        for(int i=numbers1.size()-1;i>=0;i--){
//            for(int j=numbers2.size()-1;j>=0;j--){
//                if(numbers1.get(i)==numbers2.get(j)){
//                    commonNumber.add(numbers1.get(i));
//                    break;
//                }
//            }
//        }
//        System.out.println(commonNumber);
    }
}
