package com.tuean.LeetCode.L100toL199;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L112 {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//    下面的算法还有问题 总的是把所有值都算出来再查看是否存在
//    public static boolean hasPathSum(TreeNode root, int sum) {
//        if (root == null) return false;
//        Set<Integer> list = new HashSet<>();
//        cal(list, 0, root);
//        return list.contains(sum);
//    }
//
//    private static void cal(Set<Integer> list, int val, TreeNode node){
//        if (node == null) return;
//        if (node.left == null && node.right == null) {
//            list.add(val);
//            return;
//        }
//        cal(list, node.val + val, node.left);
//        cal(list, node.val + val, node.right);
//    }

//    from discussion 上面的想法太复杂了 还有额外的空间要求 性能不好
//    直接在递归中判断剩余值是否相等

    public boolean hasPathSum(TreeNode root, int sum) {
        // recursion method
        if (root == null) return false;
        if (root.left == null && root.right == null && root.val == sum) return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
//        TreeNode one = new TreeNode(1);
//        one.left = new TreeNode(2);
//        System.out.println(hasPathSum(one, 2));
    }
}
