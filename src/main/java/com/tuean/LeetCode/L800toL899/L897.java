package com.tuean.LeetCode.L800toL899;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class L897 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // 获取所有的点后排序 再重新生成一个TreeNode

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getValueList(root, list);

        list.sort(Comparator.naturalOrder());

        int size = list.size();
        if (size < 1) {
            return null;
        }
        TreeNode result = new TreeNode(0);
        TreeNode node = new TreeNode(list.get(0));
        result.right = node;
        for (int i = 1; size > i; i++) {
            node.right = new TreeNode(list.get(i));
            node = node.right;
        }
        return result.right;
    }

    private void getValueList(TreeNode node, List<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        getValueList(node.left, list);
        getValueList(node.right, list);
    }


    // res = inorder(root.left) + root + inorder(root.right)
    // 利用二叉树左节点比又节点小的特点 直接把左节点作为新的根节点 把原来的根节点作为新的根节点的右节点

    public TreeNode increasingBST2(TreeNode root) {
        return increasingBST(root, null);
    }

    public TreeNode increasingBST(TreeNode root, TreeNode tail) {
        if (root == null) return tail;
        TreeNode res = increasingBST(root.left, root);
        root.left = null;
        root.right = increasingBST(root.right, tail);
        return res;
    }


}
