package com.tuean.LeetCode;

public class L129 {

    /**
     *
     */


    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }

    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    public static int sum(TreeNode node, int x){
        return node == null ? 0 :
                node.left == null && node.right == null ? node.val + x * 10 :
                        sum(node.left, node.val + x * 10) + sum(node.right, node.val + x * 10);
    }

}
