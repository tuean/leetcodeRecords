package com.tuean.LeetCode.L200toL299;

public class L235 {


   public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }


//    According to the definition of LCA on Wikipedia:
//    “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has
//          both p and q as descendants (where we allow a node to be a descendant of itself).”
//    找到二叉树给定两个值的LCA

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val - p.val) * (root.val - q.val) > 0)
            root = p.val < root.val ? root.left : root.right;
        return root;
    }
}
