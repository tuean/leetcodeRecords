package com.tuean.LeetCode.L1toL99;

public class L19 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 在一次循环中完成
        // 用快慢指针 慢指针比快指针慢n次
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode fast = node;
        ListNode slow = node;
        while (fast.next != null) {
            fast = fast.next;
            if (n <= 0) {
                slow = slow.next;
            }
            n--;
        }
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return node.next;
    }
}
