package com.examples;

public class StringManipulation {

    public static void main(String[] args){
        String str="Ab@#$12";
        char[] chr= str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<chr.length;i++){
            if(Character.isUpperCase(chr[i])){
                stringBuilder.append(Character.toLowerCase(chr[i]));
            }
            if(Character.isLowerCase(chr[i])){
                stringBuilder.append(Character.toUpperCase(chr[i]));
            }
            if(Character.isDigit(chr[i])){
                stringBuilder.append(chr[i]);
            }
            if(!Character.isLetterOrDigit(chr[i]) && !Character.isWhitespace(chr[i])){
                stringBuilder.append(chr[i]);
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
