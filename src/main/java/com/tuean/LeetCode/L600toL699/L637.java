package com.tuean.LeetCode.L600toL699;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L637 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // 找二叉树每一层和的平均值 就修改下 求二叉树每一层和的算法就好了

    public static List<Double> averageOfLevels(TreeNode root) {
        Map<Integer, Double> dataMap = new HashMap<>();
        Map<Integer, Double> numMap = new HashMap<>();
        cal(root, 1, dataMap, numMap);
        List<Double> result = new ArrayList<>();
        int x = 1;
        while (dataMap.containsKey(x)) {
            result.add( dataMap.get(x) / numMap.get(x));
            x++;
        }
        return result;
    }


    public static void cal(TreeNode node, Integer level, Map<Integer, Double> dataMap, Map<Integer, Double> numMap) {
        if (node == null) return;
        dataMap.put(level, dataMap.getOrDefault(level, 0.0) + node.val);
        numMap.put(level, numMap.getOrDefault(level, 0.0) + 1);
        level += 1;
        cal(node.left, level, dataMap, numMap);
        cal(node.right, level, dataMap, numMap);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        averageOfLevels(node);
    }
}
