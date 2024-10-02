package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static int[] arrayRankTransform(int[] arr) {
        int[] newArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newArr);
        int[] distinctArr = Arrays.stream(newArr).distinct().toArray();

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < distinctArr.length; i++){
            map.put(distinctArr[i], i+1);
        }

        List<Integer> list = new ArrayList<Integer>();

        Arrays.stream(arr).forEach(System.out::println);
        for(int i = 0; i < arr.length; i++){
            list.add(map.get(arr[i]));
        }
        int[] finalArr = new int[arr.length];
        return list.stream().mapToInt(Number::intValue).toArray();

    }
}
