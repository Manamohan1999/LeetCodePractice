package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(new Solution().maxSubArray(nums));
    }
}
