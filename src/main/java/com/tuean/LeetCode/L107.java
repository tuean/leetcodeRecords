package com.tuean.LeetCode;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L107 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        Map<Integer, List<Integer>> list = new HashMap<>();
        get(list, 0, root);
        List<List<Integer>> result = new ArrayList<>();
        // 翻转
        for (int x = list.size() -1; x >= 0; x--){
            result.add(list.get(x));
        }
        return result;
    }


    public static void get(Map<Integer, List<Integer>> result, int index, TreeNode node){
        List<Integer> list = null;
        if (result.containsKey(index)) {
            list = result.get(index);
        } else {
            list = new ArrayList<>();
        }

        if (node == null) {
            return;
        }
        Integer val = node.val;
        if (val != null) {
            list.add(val);
            result.put(index, list);
        }
        int nextIndex = index + 1;
        get(result, nextIndex, node.left);
        get(result, nextIndex, node.right);

    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        node.right = right;
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        System.out.println(JSON.toJSONString(levelOrderBottom(node)));
    }


}
