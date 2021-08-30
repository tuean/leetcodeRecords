package com.tuean.LeetCode.L100toL199;

/**
 * 链表找环
 *
 *
 */
public class L142 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode s1 = head, s2 = head;
        while (true) {
            s1 = s1.next;
            s2 = s2.next == null ? null : s2.next.next;
            if (s1 == null || s2 == null) return null;
            if (s1 == s2) {
                ListNode ptr = head;
                while (ptr != s1) {
                    ptr = ptr.next;
                    s1 = s1.next;
                }
                break;
            }
        }

        return s1;
    }


}
