package com.tuean.LeetCode.L100toL199;

public class L104 {

    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }

//    找到树的最大深度

//    一遍过 贼帅

    public int maxDepth(TreeNode root) {
        return maxDepth(root, 1);
    }

    public static int maxDepth(TreeNode node, int depth) {
        if (node == null) return depth - 1;
        if (node.left == null && node.right == null) return depth;
        int next = depth + 1;
        return Math.max(maxDepth(node.left, next), maxDepth(node.right, next));
    }

}
