package com.tuean.LeetCode.L200toL299;

import java.util.ArrayList;
import java.util.List;

public class L234 {


//    判断是否是回文的链表

    // todo 有更好的方法

    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }


   // 转成字符串在判断就好了

    public static boolean isPalindrome(ListNode head) {
        List<String> list = new ArrayList<>();
        while (head != null) {
            list.add(String.valueOf(head.val));
            head = head.next;
        }

        return isPalindrome(list);
    }



    private static boolean isPalindrome(List<String> list) {
        if (list.isEmpty()) {
            return true;
        }
        int head = 0, tail = list.size() - 1;
        String cHead, cTail;
        while(head <= tail) {
            cHead = list.get(head);
            cTail = list.get(tail);
            if (cHead.equals(cTail)) {
                return false;
            }
            head++;
            tail--;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode n = new ListNode(1);
        n.next = new ListNode(2);
        System.out.println(isPalindrome(n));
    }
}
