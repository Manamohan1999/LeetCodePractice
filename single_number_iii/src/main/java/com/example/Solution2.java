package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    public static int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i< nums.length;){
            if(i == nums.length-1){
                list.add(nums[i]);
                break;
            }
            if(nums[i] == nums[i+1]) 
                i+=2;
            else {
                list.add(nums[i]);
                i++;
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}