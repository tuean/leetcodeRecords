package com.tuean.LeetCode.L100toL199;

public class L110 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//    判断一颗树是不是平衡的 与108的题正好反过来

//    直接算高度 然后对比 不要整那些花里胡哨的

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return height(root) != -1;
    }

    public static int height(TreeNode node) {
        if (node == null) return 0;
        int l = height(node.left);
        int r = height(node.right);
        if (l == -1 || r == -1) return -1;
        if (Math.abs(l - r) > 1) return -1;
        return Math.max(l ,r) + 1;
    }
}
