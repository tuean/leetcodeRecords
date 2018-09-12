package com.tuean.LeetCode.L1toL99;

public class L25 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * from discuss
     *
     * brilliant solution
     *
     * 思路如下
     * 以k的大小进行切割 找到最后一个可以翻转的k长度的链表
     * 从最后一个链表开始翻转 结束后返回链表头 重复相同操作 直到返回新列表的链表头
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = head;
        int count = 0;
        while (node != null && count < k) {
            node = node.next;
            count++;
        }
        if (count == k){
            ListNode last = reverseKGroup(node, k);
            while (count > 0) {
                ListNode next = head.next;
                head.next = last;
                last = head;
                head = next;
                count--;
            }
            head = last;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        System.out.println(reverseKGroup(node1, 2));
        ;
    }

}
