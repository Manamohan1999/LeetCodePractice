package com.example;

public class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            max = Integer.max(sum, max);
            sum = (sum < 0) ? 0 : sum;
        }
        return max;
    }
}
