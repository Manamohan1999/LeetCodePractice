package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] arr = {"d1/","d2/","../","d21/","./"};
        System.out.println(Solution.minOperations(arr));
    }
}