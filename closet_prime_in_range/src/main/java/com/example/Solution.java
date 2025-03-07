package com.example;

import java.util.stream.IntStream;

public class Solution {

    public int[] closestPrimes(int left, int right){
        int[] result = IntStream.rangeClosed(left, right)
                            .filter(item -> isPrime(item))
                            .limit(2)
                            .toArray();
        if(result.length < 2)
            return new int[]{-1, -1};

        return result;
    }

    public boolean isPrime(int num){
        return !(IntStream.rangeClosed(2, num/2)
                        .filter(item -> num % item == 0)
                        .count() > 0);
    }
}
