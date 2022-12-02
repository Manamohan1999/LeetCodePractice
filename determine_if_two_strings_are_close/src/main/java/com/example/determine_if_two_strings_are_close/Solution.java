package com.example.determine_if_two_strings_are_close;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public boolean closeStrings(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();

        if (length1 != length2)
            return false;

        String[] arr1 = word1.split("");
        String[] arr2 = word2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        word1 = String.join("", arr1);
        word2 = String.join("", arr2);

        if (word1.equals(word2))
            return true;

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < length1; i++) {
            if (map1.get(arr1[i]) != null)
                map1.replace(arr1[i], map1.get(arr1[i]) + 1);
            else
                map1.put(arr1[i], 1);

            if (map2.get(arr2[i]) != null)
                map2.replace(arr2[i], map2.get(arr2[i]) + 1);
            else
                map2.put(arr2[i], 1);
        }

        if (map1.size() != map2.size())
            return false;

        List<String> list1 = map1.keySet().stream().sorted().collect(Collectors.toList());
        List<String> list2 = map2.keySet().stream().sorted().collect(Collectors.toList());

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i)))
                return false;
        }

        Integer[] finalArr1 = map1.values().stream().sorted().toArray(n -> new Integer[n]);
        Integer[] finalArr2 = map2.values().stream().sorted().toArray(n -> new Integer[n]);

        for (int i = 0; i < finalArr1.length; i++) {
            if (!finalArr1[i].equals(finalArr2[i]))
                return false;
        }

        return true;
    }
}
