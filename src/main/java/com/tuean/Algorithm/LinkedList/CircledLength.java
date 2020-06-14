package com.tuean.Algorithm.LinkedList;

public class CircledLength {

    // 链表有环的情况下 衍生

    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    // 找到环的长度
    public static int CircleLength(Node node) {
        Node fast = node;
        Node slow = node;
        int length = 0;
        boolean flag = false;
        while (slow != null && slow.next != null) {
            fast = fast.next;
            slow = slow.next.next;
            if (fast == slow) {
                if (!flag) {
                    flag = true;
                    continue;
                }
                if (flag) {
                    return length;
                }
                length++;
            }
        }
        return 0;
    }

    // 找到入环节点
    public static Node findFirstCircle(Node node) {
        Node first = node;
        Node meet = null;
        Node fast = node;
        Node slow = node;
        while (slow != null && slow.next != null) {
            fast = fast.next;
            slow = slow.next.next;
            if (fast == node) {
                meet = fast;
            }
        }

        while (first != fast) {
            first = first.next;
            fast = fast.next;
        }
        return first;
    }



}
