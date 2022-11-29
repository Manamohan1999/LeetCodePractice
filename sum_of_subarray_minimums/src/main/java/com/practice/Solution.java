package com.practice;

import java.util.Arrays;

public class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;

        double sum = 0.0;

        int length = 1;
        for (int i = 0; i < n;) {
            if (i + length <= n) {
                int[] temp = Arrays.copyOfRange(arr, i, i + length);
                Arrays.sort(temp);
                sum += temp[0];
                length++;
            } else {
                i++;
                length = 1;
            }
        }

        return (int) sum;
    }
    // public int sumSubarrayMins(int[] arr) {
    // int n = arr.length;

    // double sum = 0.0;

    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j <= n; j++) {
    // int[] temp = Arrays.copyOfRange(arr, i, j);
    // System.out.println(Arrays.toString(temp));
    // Arrays.sort(temp);

    // int min = temp[0];

    // sum += min;
    // }
    // }
    // double mod = Math.pow(10, 9) + 7;

    // sum %= mod;
    // return (int) sum;
    // }

}
