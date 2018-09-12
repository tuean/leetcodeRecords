package com.tuean.LeetCode.L100toL199;

public class L101 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//    判断是否是对称的树

    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root,root);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val == q.val) return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
        return false;
    }

}
