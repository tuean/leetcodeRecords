package com.tuean.LeetCode.L1toL99;

public class L83 {

    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }

//    Input: 1->1->2->3->3
//    Output: 1->2->3
//    链表中去除重复的值

    public ListNode deleteDuplicates(ListNode head) {

//        递归
//        if (head == null) return head;
//        head.next = deleteDuplicates(head.next);
//        return head.val == head.next.val ? head.next : head;

//      普通循环
        ListNode list = head;
        while (list != null) {
            if (list.next == null) {
                break;
            }
            if (list.val != list.next.val) {
                list = list.next;
            } else {
                list.next = list.next.next;
            }
        }
        return head;
    }

}
