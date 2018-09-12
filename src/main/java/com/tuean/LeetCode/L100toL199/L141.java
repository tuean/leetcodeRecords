package com.tuean.LeetCode.L100toL199;

public class L141 {

    class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }


//   判断是否会闭环
//    快慢指针？
//   看了答案  果然是快慢指针

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode faster = head;
        ListNode slower = head;
        while (faster != null && faster.next != null) {
            faster = faster.next.next;
            slower = slower.next;
            if (faster == slower) return true;
        }
        return false;
    }
}
