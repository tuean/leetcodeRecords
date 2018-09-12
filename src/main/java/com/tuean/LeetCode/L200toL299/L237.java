package com.tuean.LeetCode.L200toL299;

public class L237 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

//    删除链表中指定的值
//    就是链表node直接调 删除自身

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
