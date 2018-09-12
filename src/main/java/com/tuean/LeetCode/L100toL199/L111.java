package com.tuean.LeetCode.L100toL199;

public class L111 {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        int L = minDepth(root.left), R = minDepth(root.right), m = Math.min(L, R);
        return 1 + (m > 0 ? m : Math.max(L, R));
    }


    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        one.left = new TreeNode(2);
        System.out.println(minDepth(one));
    }
}
