package com.tuean.LeetCode.L1toL99;

public class L19 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    // Given a linked list, remove the n-th node from the end of list and return its head.
    // 在一次循环中完成
    // 用快慢指针 慢指针比快指针慢n次

    public static ListNode removeNthFromEnd(ListNode head, int n) {
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


    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        removeNthFromEnd(node, 2);
    }
}
