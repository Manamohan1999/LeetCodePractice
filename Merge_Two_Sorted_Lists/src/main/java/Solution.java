public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        return mergeTwoLists(list1, list2, new ListNode());
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2, ListNode outputList){
        if(list1 == null){
            if(list2 == null){
                return null;
            }else{
                outputList.val = list2.val;
                outputList.next = mergeTwoLists(null, list2.next, new ListNode());
            }
        }else{
            if(list2 == null){
                outputList.val = list1.val;
                outputList.next = mergeTwoLists(list1.next, null, new ListNode());
            }else{
                if(list1.val <= list2.val){
                    outputList.val = list1.val;
                    outputList.next = mergeTwoLists(list1.next, list2, new ListNode());
                }else {
                    outputList.val = list2.val;
                    outputList.next = mergeTwoLists(list1, list2.next, new ListNode());
                }
            }
        }
        return outputList;
    }
}
