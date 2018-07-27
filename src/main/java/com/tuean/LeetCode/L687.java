package com.tuean.LeetCode;



public class L687 {

    // 找到最长的相同值的点个数

    // todo 不能使用 static or 全局变量 改用参数

    private static int result = 0;

    public static int longestUnivaluePath(TreeNode root) {
        if(root == null){
            return 0;
        }
        handle(root);
        return result;
    }

    private static int handle(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = handle(node.left);
        int right = handle(node.right);

        int l = 0;
        int r = 0;
        if(node.left != null && node.left.val == node.val){
            l = left + 1;
        }
        if(node.right != null && node.right.val == node.val){
            r = right + 1;
        }
        int max = l > r ? l : r;
        result = Math.max(result, max);
        return max;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode re = new TreeNode(1);
        re.left = new TreeNode(1);
        re.right = new TreeNode(1);
        int x = longestUnivaluePath(re);
        System.out.println(x);
    }



    public int longestUnivaluePathDefault(TreeNode root) {
        int[] res = new int[2];
        if (root != null) {
            dfs(root, res);
        }
        return res[0];
    }

    private int dfs(TreeNode node, int[] res) {
        // Longest-Univalue-Path-Start-At - left child
        int l = node.left != null ? dfs(node.left, res) : 0;
        // Longest-Univalue-Path-Start-At - right child
        int r = node.right != null ? dfs(node.right, res) : 0;
        // Longest-Univalue-Path-Start-At - node, and go left
        int resl = node.left != null && node.left.val == node.val ? l + 1 : 0;
        // Longest-Univalue-Path-Start-At - node, and go right
        int resr = node.right != null && node.right.val == node.val ? r + 1 : 0;
        // Longest-Univalue-Path-Across - node
        res[0] = Math.max(res[0], resl + resr);
        return Math.max(resl, resr);
    }
}
