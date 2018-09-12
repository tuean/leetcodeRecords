package com.tuean.LeetCode.L1toL99;

public class L21 {

//    Input: 1->2->4, 1->3->4
//    Output: 1->1->2->3->4->4

    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }




    public static void main(String[] args) {
//        [1,2,4]
//        [1,3,4]
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        mergeTwoLists(l1, l2);
    }
}
