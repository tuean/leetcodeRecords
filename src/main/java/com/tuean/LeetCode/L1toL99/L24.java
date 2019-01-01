package com.tuean.LeetCode.L1toL99;

public class L24 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // 循环 速度慢一点
    public static ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(321);
        node.next = head;
        ListNode result = null;
        while (node.next != null && node.next.next != null) {
            ListNode next = node.next.next.next;
            ListNode tmp = node.next;
            node.next = node.next.next;
            node.next.next = tmp;
            node.next.next.next = next;
            if (result == null) {
                result = node.next;
            }
            node = node.next.next;
        }
        if (result == null) result = head;
        return result;
    }


    // 递归 速度快很多啊
    public ListNode swapPairsFaster(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = head.next;
        ListNode nextswap = head.next.next;
        node.next = head;
        head.next = swapPairs(nextswap);
        return node;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        swapPairs(node);
    }
}
