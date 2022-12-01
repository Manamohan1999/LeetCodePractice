package com.example.determine_if_string_halves_are_alike;

import java.util.Arrays;

public class Solution {
    public boolean halvesAreAlike(String s) {
        int size = s.length();
        String firstHalf = s.substring(0,size/2);
        String secondHalf = s.substring(size/2, size);

        long firstHalfCount = countVowels(firstHalf);
        long secondHalfCount = countVowels(secondHalf);
        return firstHalfCount == secondHalfCount;
    }

    private long countVowels(String s){
        return Arrays.stream(s.split(""))
            .filter(i-> i.matches("[a,e,i,o,u,A,E,I,O,U]"))
            .count();
    }
}
