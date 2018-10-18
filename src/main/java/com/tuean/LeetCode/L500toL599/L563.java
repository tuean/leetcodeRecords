package com.tuean.LeetCode.L500toL599;

public class L563 {


    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }


    int result = 0;
    public int findTilt(TreeNode root) {

        return getSum(root);
    }

    public int getSum(TreeNode node) {
        if (node == null) return 0;
        int left = getSum(node.left);
        int right = getSum(node.right);
        int min = Math.abs(left - right);
        result += min;
        return left + right + node.val;
    }

//    public static void main(String[] args) {
//        TreeNode one = new TreeNode(1);
//        one.left = new TreeNode(2);
//        one.left.left = new TreeNode(4);
//        one.right = new TreeNode(3);
//        one.right.left = new TreeNode(5);
//        System.out.println(findTilt(one));
//    }


}
