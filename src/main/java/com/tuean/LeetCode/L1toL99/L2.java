package  com.tuean.LeetCode.L1toL99;

import java.util.ArrayList;
import java.util.List;

public class L2 {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode ln1 = l1, ln2 = l2, head = null, node = null;
//        int carry = 0, remainder = 0, sum = 0;
//        head = node = new ListNode(0);
//
//        while(ln1 != null || ln2 != null || carry != 0) {
//            sum = (ln1 != null ? ln1.val : 0) + (ln2 != null ? ln2.val : 0) + carry;
//            carry = sum / 10;
//            remainder = sum % 10;
//            node = node.next = new ListNode(remainder);
//            ln1 = (ln1 != null ? ln1.next : null);
//            ln2 = (ln2 != null ? ln2.next : null);
//        }
//        return head.next;

//        List<Long> list1 = new ArrayList<>();
//        List<Long> list2 = new ArrayList<>();
//        while (l1 != null) {
//            list1.add((long) l1.val);
//            l1 = l1.next;
//        }
//        while (l2 != null) {
//            list2.add((long) l2.val);
//            l2 = l2.next;
//        }
//        int s1 = 0, s2 = 0;
//        long sum1 = 0, sum2 = 0;
//        while (s1 < list1.size() || s2 < list2.size()) {
//            if (s1 < list1.size()) {
//                sum1 += Math.pow(10, (s1)) * list1.get(s1);
//                s1++;
//            }
//            if (s2 < list2.size()) {
//                sum2 += Math.pow(10, (s2)) * list2.get(s2);
//                s2++;
//            }
//        }
//        String[] ss = String.valueOf(sum1 + sum2).split("");
//        int index = 1;
//        ListNode result = new ListNode(0);
//        ListNode tmp = result;
//        while (index <= ss.length) {
//            tmp.next = new ListNode(Integer.parseInt(ss[ss.length - index]));
//            tmp = tmp.next;
//            index++;
//        }
//        result = result.next;
//        while (result.next != null) {
//            if (result.val == 0) {
//                result = result.next;
//            } else {
//                break;
//            }
//        }
//        return result;
//    }

    // 我特么题目理解错误 傻逼explanation 误导我
    // 不要计算大数 会有溢出  不好
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode header = new ListNode(0);
        ListNode cur = header;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0)  cur.next = new ListNode(carry);
        return header.next;
    }

        public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        addTwoNumbers(l1, l2);
    }
}
