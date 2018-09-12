package com.tuean.LeetCode.L400toL499;

public class L450 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//    二叉树删除节点方法

//    four principles
//  node doesn't have left or right - return null
//  node only has left subtree- return the left subtree
//  node only has right subtree- return the right subtree
//  node has both left and right -
//      find the minimum value in the right subtree, set that value to the currently found node, then recursively delete the minimum value in the right subtree

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, root.val);
        } else {
            if (root.val > key) {
                root.left = deleteNode(root.left, key);
            } else {
                root.right = deleteNode(root.right, key);
            }
        }
        return root;
    }

    private static TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

}
