package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] nums = { 2, 14, 18, 22, 22 };
        System.out.println(new Solution().containsDuplicate(nums));
        // List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,3));

        // Map<Integer, Long> result = list.stream()
        // .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // System.out.println(result);

        // Map<Integer,Long> result2 = Arrays.stream(nums)
        // .boxed()
        // .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // System.out.println(result2.values());
    }
}
