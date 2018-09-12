package com.tuean.LeetCode.L100toL199;

public class L160 {

    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }

//   找出两个链表相同的部分的起点
//    把两个链表连起来

//    如果存在 总会返回的？ 很神奇 纸上画了一遍 确实总是会返回的
//    如果不存在 返回null

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l6.next = l4;
        System.out.println(getIntersectionNode(l1, l6));
    }
}
