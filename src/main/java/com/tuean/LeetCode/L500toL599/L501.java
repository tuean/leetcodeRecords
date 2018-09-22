package com.tuean.LeetCode.L500toL599;

import java.util.*;

public class L501 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    // 没通过 还有点问题

    int max = 0;
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        findMode(root, map);
        Iterator iterator = map.entrySet().iterator();

        List<Integer> list = new ArrayList<>();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if (map.get(entry.getKey()) == max) list.add((Integer) entry.getKey());
        }

        int[] result = new int[list.size()];
        for (int x = 0; x < list.size(); x++) {
            result[x] = list.get(x);
        }
        return result;
    }

    private void findMode(TreeNode node, Map<Integer, Integer> map) {
        if (node == null) return;
        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        findMode(node.left);
        findMode(node.right);
        max = Math.max(max, map.get(node.val));
    }

}
