package com.tuean.LeetCode.L800toL899;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L872 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    // solving1 递归

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> r1 = new LinkedList<>();
        List<Integer> r2 = new LinkedList<>();

        getList(root1, r1);
        getList(root2, r2);

        return r1.equals(r2);
//        if (r1.size() != r2.size()) return false;
//        for (int x = 0; x < r1.size(); x++) {
//            if (r1.get(x) != r2.get(x)) {
//                return false;
//            }
//        }
//        return true;
    }

    private void getList(TreeNode node, List<Integer> list) {
        if (node == null) return;

        if (node.left == null && node.right == null) list.add(node.val);

        if (node.left != null) getList(node.left, list);
        if (node.right != null) getList(node.right, list);
    }

    // todo solving2 dfs

}
