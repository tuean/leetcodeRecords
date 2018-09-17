package com.tuean.LeetCode.L400toL499;

public class L404 {


    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

   // 找到所有左叶子节点的和

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        int x = sumNode(root, 0, false);
        return x;
    }

    public static int sumNode(TreeNode node, int sum, boolean flag) {
        if (node == null) return 0;


        // 题目理解清楚就好了 左叶子就是左边右边都没节点的
        if (node.left == null && node.right == null && flag) {
            sum += node.val;
        }

        int left = sumNode(node.left, sum, true);
        int right = sumNode(node.right, sum, false);

        return left + right + sum;
    }

    public static void main(String[] args) {
//        TreeNode three = new TreeNode(3);
//        three.left = new TreeNode(9);
//        TreeNode twenty = new TreeNode(20);
//        twenty.left = new TreeNode(15);
//        twenty.right = new TreeNode(7);
//        three.right = twenty;
        TreeNode top = new TreeNode(0);
        TreeNode two = new TreeNode(2);
        two.left = new TreeNode(1);
        two.left.left = new TreeNode(5);
        two.left.right = new TreeNode(1);
        top.left = two;

        top.right = new TreeNode(4);
        top.right.left = new TreeNode(3);
        top.right.left.right = new TreeNode(6);
        top.right.right = new TreeNode(-1);
        top.right.right.right = new TreeNode(8);

        int x =  sumOfLeftLeaves(top);
        System.out.print(x);
    }
}
