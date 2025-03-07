package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Solution sol = new Solution();
        int[] arr = sol.closestPrimes(4, 6);
        System.out.println(Arrays.toString(arr));
        // System.out.println(sol.isPrime(10));
    }
}