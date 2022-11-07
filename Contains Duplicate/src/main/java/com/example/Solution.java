package com.example;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int num : nums){
        // if(containsDuplicate(num, nums) >= 2)
        // return true;
        // }
        Map<Integer, Long> result = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return result.values().stream()
                .anyMatch(i -> i >= 2);
        // return false;
    }

    public long containsDuplicate(int num, int[] nums) {
        return Arrays.stream(nums)
                .filter(item -> item == num)
                .count();
    }

}
