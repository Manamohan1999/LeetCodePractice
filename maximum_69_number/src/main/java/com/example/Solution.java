package com.example;

public class Solution {
    public int maximum69Number (int num) {
        String number[] = Integer.toString(num).split("");
        for(int i=0;i<number.length;i++){
            if(number[i].equals("6")){
                number[i] = "9";
                return Integer.parseInt(String.join("", number));
            }
        }
        return num;
    }
}
