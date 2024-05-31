package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            if (map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else
                map.put(i, 1);
        }
        // System.out.println(map);
        List<Integer> list = new ArrayList<>();
        map.keySet().forEach(i-> {
            if(map.get(i) == 1) list.add(i);
        });
        return list.stream().mapToInt(i->i).toArray();
    }
}