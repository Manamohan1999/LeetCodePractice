public class MainClass {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = new MainClass().addTwoNumbers(l1,l2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode result = new ListNode();
        ListNode worker = result;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1){
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = sum /10;
            ListNode digit = new ListNode(sum%10);
            worker.next = digit;
            worker = worker.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        return result.next;
    }
}

