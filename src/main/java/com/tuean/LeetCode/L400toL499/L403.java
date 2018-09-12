package com.tuean.LeetCode.L400toL499;

import java.util.ArrayList;
import java.util.List;
public class L403 {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(){}

        public Node(int _val, Node _prev, Node _next, Node _child){
            val = _val;
            prev = _prev;
            next = _next;
            child = _child;
        }
    }
    public Node flatten(Node head) {
        getLast(head);
        return head;
    }

    // todo 还不对 差一点

    private Node getLast(Node node) {
        Node current = node;
        while (current != null) {
            if (current.child != null) {

                Node nextTmp = current.next;

                current.child.prev = current;
                current.next = current.child;
                current.child = null;

                Node last = getLast(current.child);
                if (last != null) {
                    last.next = nextTmp;
                    nextTmp.prev = last;
                }


            }
            current = current.next;
        }
        return current;
    }



}
