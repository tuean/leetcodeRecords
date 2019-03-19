package com.tuean.LeetCode.L100toL199;

/**
 * <h1>title</h1> Populating Next Right Pointers in Each Node
 *
 */
public class L116 {

    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) { val = x; }
    }


    public void connect(TreeLinkNode root) {
        // solution 1
        if (root == null) return;

        if (root.left != null) {
            root.left.next = root.right;
            if (root.next != null) {
                root.right.next = root.next.left;
            }
        }

        connect(root.left);
        connect(root.right);

        // solution 2

    }

}
