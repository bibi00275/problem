package com.examples;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCycle {
    public static void main(String[] args){
            String str ="helloworldh";
            char[] charArray = str.toCharArray();
            Map<Character,Integer> hashMap = new HashMap<>();
            for(Character chr: charArray){
                if(hashMap.containsKey(chr)){
                    hashMap.put(chr,hashMap.get(chr)+1);
                }else{
                    hashMap.put(chr,1);
                }
            }
            for(Map.Entry<Character,Integer> keyValues: hashMap.entrySet()){
                System.out.print( keyValues.getKey()+""+keyValues.getValue());
            }
    }
}
