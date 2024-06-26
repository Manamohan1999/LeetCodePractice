package com.example;

public class Solution {
    public static String convertToTitle(int columnNumber) {
        if(columnNumber == 0) return "";
        columnNumber--;
        return convertToTitle(columnNumber/26) + (char)((columnNumber%26) + 65);
    }
}
