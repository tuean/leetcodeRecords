package com.tuean.Algorithm.LinkedList;

public class RemoveDuplicate {

    // 去除链表中重复的value

     private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }


    public Node removeDuplicate(Node node) {
         if (node == null || node.next == null) return null;
        Node head = node;
        while (head != null && head.next != null) {
            if (head.data == head.next.data) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return node;
    }


}
