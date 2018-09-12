package com.tuean.LeetCode.L200toL299;

public class L226 {


//    Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.
//    翻转二叉树


    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        invertTree(root.left);
        invertTree(root.right);
        TreeNode tmp = root.left;
        TreeNode tmp2 = root.right;
        root.right = tmp;
        root.left = tmp2;
        return root;

//        if (root == null) return null;
//        TreeNode temp = root.left;
//        root.left = invertTree(root.right);
//        root.right = invertTree(temp);
//        return root;
    }

//    public void invertTree(TreeNode node, TreeNode left, TreeNode right) {
//        if (node == null) return;
//        invertTree(node.left, node.left.left, node.left.right);
//        invertTree(node.right, node.right.left, node.right.right);
//        TreeNode tmp = left;
//        node.right = left;
//        node.left = tmp;
//        return;
//    }
}
