package com.tuean.LeetCode.L100toL199;

public class L148 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

//    Sort a linked list in O(n log n) time using constant space complexity.
//    Input: 4->2->1->3
//    Output: 1->2->3->4

    public ListNode sortList(ListNode head) {
        // merge sort
        return null;
    }

    /**
     * split the list and return the next node
     *
     * @param start
     * @param length
     * @return
     */
    private ListNode split(ListNode start, int length) {
        if (start == null) return null;
        for (int i = 0; length > i; i++) {
            start = start.next;
        }
        start.next = null;
        return start;
    }

    /**
     * merge two list and return the new list head
     *
     * @param p1
     * @param p2
     * @return
     */
    private ListNode merge(ListNode p1, ListNode p2) {
        while (p1 != null || p2 != null) {
            if (p1.val > p2.val) {

            }
        }
        return null;
    }


}
