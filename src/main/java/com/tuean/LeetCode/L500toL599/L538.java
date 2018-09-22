package com.tuean.LeetCode.L500toL599;

public class L538 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    // 因为二叉树的特性 从右边即大的一遍开始计算 值全部加到当前节点就好了

    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }

    public void convert(TreeNode cur) {
        if (cur == null) return;
        convert(cur.right);
        cur.val += sum;
        sum = cur.val;
        convert(cur.left);
    }
}
