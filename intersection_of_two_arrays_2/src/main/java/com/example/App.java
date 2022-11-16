package com.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] nums1 = { 1,2,2,1};
        int[] nums2 = { 2,2};

        System.out.println(Arrays.toString(new Solution().intersect(nums1, nums2)));
    }
}
