package com.tuean.LeetCode.L200toL299;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class L257 {

//    Input:
//
//            1
//          /   \
//         2     3
//          \
//           5
//
//    Output: ["1->2->5", "1->3"]
//
//    Explanation: All root-to-leaf paths are: 1->2->5, 1->3

    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) binaryTreePaths(root, "", result);

        return result;
    }

    public static void binaryTreePaths(TreeNode root, String last, List<String> list) {
        last = "".equals(last) ? String.valueOf(root.val) : last + "->" + root.val;
        if (root.left == null && root.right == null) {
            if (!"".equals(last) && !list.contains(last)) {
                list.add(last);
            }
        }
        if (root.left != null)  binaryTreePaths(root.left, last, list);
        if (root.right != null) binaryTreePaths(root.right, last, list);
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode five = new TreeNode(5);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        one.left = two;
        one.right = three;
        two.right = five;
        binaryTreePaths(one);
    }
}
