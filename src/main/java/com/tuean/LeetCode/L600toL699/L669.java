package com.tuean.LeetCode.L600toL699;

public class L669 {


    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }


    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null) return null;

        if(root.val < L) return trimBST(root.right, L, R);
        if(root.val > R) return trimBST(root.left, L, R);

        root.left = root.val == L ? null : trimBST(root.left, L, R);
        root.right = root.val == R ? null : trimBST(root.right, L, R);

        return root;
    }
}
