package com.tuean.LeetCode.L600toL699;

import com.tuean.LeetCode.L1toL99.L95;

import java.util.ArrayList;
import java.util.List;

public class L653 {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }

    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        return find(root, k, list);
    }

    public boolean find(TreeNode node, int k, List<Integer> list) {
        if (node == null) return false;
        if (list.contains(k - node.val)) {
            return true;
        }
        list.add(node.val);
        return find(node.left, k, list) || find(node.right, k, list);
    }
}
