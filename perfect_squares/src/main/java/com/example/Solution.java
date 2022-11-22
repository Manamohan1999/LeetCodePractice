package com.example;

public class Solution {

    //to store the count of visited numbers for avoiding visiting again
    private int[] squares = new int[10001];

    public int numSquares(int n) {
        if (n == 0)
            return 0;

        //checking if the number is already visited
        if(squares[n] != 0)
            return squares[n];

        int count = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            //adding one step to the count steps
            int result = 1 + numSquares(n - (i * i));
            count = Integer.min(count, result);
        }
        //storing as visited and retuning
        return squares[n] = count;
    }
}
