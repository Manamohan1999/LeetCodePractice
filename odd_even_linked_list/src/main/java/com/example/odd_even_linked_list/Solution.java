package com.example.odd_even_linked_list;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;

        ListNode oddNode = new ListNode(head.val);
        ListNode oddHead = oddNode;

        if(head.next == null) return head;
        
        ListNode evenNode = new ListNode(head.next.val);
        ListNode evenHead = evenNode;
        OddEvenNode nodes = oddEvenList(head.next.next, evenNode, oddNode);

        while(oddNode != null){
            if(oddNode.next == null){
                oddNode.next = evenHead;
                break;
            }
            oddNode = oddNode.next;
        }

        return oddHead;
    }
    private class OddEvenNode{
        ListNode oddNode;
        ListNode evenNode;

        OddEvenNode(ListNode oddNode, ListNode eveNode){
            this.oddNode = oddNode;
            this.evenNode = eveNode;
        }
    }

    private OddEvenNode oddEvenList(ListNode head, ListNode evenNode, ListNode oddNode) {
        ListNode node1 = evenNode;
        ListNode node2 = oddNode;
        int counter = 1;
        while(head != null){
            if(counter++ % 2 == 0){
                evenNode.next = new ListNode(head.val);
                evenNode = evenNode.next;
            }else{
                oddNode.next = new ListNode(head.val);
                oddNode = oddNode.next;
            }
            head = head.next;
        }
        return new OddEvenNode(node2, node1);
    }
}
