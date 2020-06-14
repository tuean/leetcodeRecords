package com.tuean.Algorithm.LinkedList;

public class IfCircle {

    // 判断链表是否有环

    // 快慢指针即可

    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }


    public static boolean ifCircle(Node node) {
        Node fast = node;
        Node slow = node;
        while (slow != null && slow.next != null) {
            fast = fast.next;
            slow = slow.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

}
