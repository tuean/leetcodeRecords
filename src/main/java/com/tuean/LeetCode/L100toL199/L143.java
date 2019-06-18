package com.tuean.LeetCode.L100toL199;

public class L143 {


    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }


//    Given a singly linked list L: L0→L1→…→Ln-1→Ln,
//    reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
//
//    You may not modify the values in the list's nodes, only nodes itself may be changed.



    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        // find the middle one
        ListNode middle = head;
        ListNode next = head;
        while (next.next != null && next.next.next != null) {
            middle = middle.next;
            next = next.next.next;
        }

        // the middle one is header
        // reverse from middle
        ListNode pre = middle;
        ListNode reCurrent = pre.next;
        while (reCurrent != null) {
            ListNode reNext = reCurrent.next;
            reCurrent.next = pre;
            pre = reCurrent;
            reCurrent = reNext;
        }

        // resort
        ListNode start = head;

        // todo 
    }
}
