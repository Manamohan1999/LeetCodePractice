package com.practice;

/**
 * Leetcode:
 * 907 : Sum of Subarray Minimums
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] arr = {3,1,2,4};

        // int[] temp = Arrays.copyOfRange(arr, 0, 1);

        // System.out.println(Arrays.toString(temp));
        

        System.out.println(new Solution().sumSubarrayMins(arr));
    }
}
