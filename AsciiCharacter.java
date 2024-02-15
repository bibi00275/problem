package com.examples;

public class AsciiCharacter {
    public static void main(String[] args){
        String s1="abc@44¡áéíóúñÑ";
        char[] chr= s1.toCharArray();
        boolean isAscii= true;
        for(int i=0;i<chr.length;i++){
            if(chr[i]>127){
                isAscii=false;
                break;
            }
        }

        System.out.println(isAscii);
    }
}
