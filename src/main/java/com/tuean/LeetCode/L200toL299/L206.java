package com.tuean.LeetCode.L200toL299;

public class L206 {

    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }


    // 翻转链表
    // 可以有两种方法 一种循环 一种递归

    public ListNode reverseList(ListNode head) {
        // 1 递归
        reverseList(head, null);

        // 2 循环
        ListNode node = null;
        while (head != null) {
            ListNode next =  head.next;
            head.next = node;
            node = head;
            head = next;
        }
        return node;
    }


    private ListNode reverseList(ListNode node, ListNode newNode) {
        if (node == null) return newNode;
        ListNode next = node.next;
        node.next = newNode;
        return reverseList(next, node);
    }

}
