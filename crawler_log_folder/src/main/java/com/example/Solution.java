package com.example;

public class Solution {
    public static int minOperations(String[] logs) {
        String goBack = "../";
        String sameFolder = "./";

        int count = 0;

        for(String item : logs){
            if(item.equals(goBack)){
                if(count > 0) count--;
            } 
            else{
                if(!item.equals(sameFolder))
                    count ++;
            }
        }

        return count;
    }
}
