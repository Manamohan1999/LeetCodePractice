package com.example.unique_number_of_occurrences;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1 );
            }else{
                map.put(arr[i], 1);
            }
        }
        return map.values().stream().distinct().count() == map.values().stream().count();
    }
}
