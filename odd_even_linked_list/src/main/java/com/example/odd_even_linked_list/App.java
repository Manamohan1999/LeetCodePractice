package com.example.odd_even_linked_list;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ListNode node = new ListNode(2, new ListNode(1,
                new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(7)))))));

        ListNode node2 = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5)))));

        new Solution().oddEvenList(node2);
    }
}
