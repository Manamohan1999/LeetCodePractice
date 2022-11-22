package com.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String makeGood(String s) {
        char[] chars = s.toCharArray();

        List<Character> list = new ArrayList<>();
        for (Character ch : chars) {
            list.add(ch);
        }

        for (int i = 0; i < list.size() - 1;) {
            char first = list.get(i);
            char second = list.get(i + 1);

            if(first == second+32 || second == first+32){
                list.remove(i+1);
                list.remove(i);
                i=0;
            }else{
                i++;
            }
        }
        String result = "";
        for(Character ch:list){
            result += ch;
        }
        return result;
    }
}
