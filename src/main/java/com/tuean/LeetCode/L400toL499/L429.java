package com.tuean.LeetCode.L400toL499;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L429 {


    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

    // 每一层的值 以从左到右的顺序存成一个列表

    // 本来想用递归 看答案是bfs

    public List<List<Integer>> levelOrder(Node root) {

        // 1 bdf
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null) return result;
//
//        Queue<Node> queue = new LinkedList<>();
//
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            List<Integer> current = new LinkedList<>();
//            int len = queue.size();
//            for (int x = 0; x < len; x++) {
//                Node c = queue.poll();
//                current.add(c.val);
//                for (Node node : c.children) {
//                    queue.offer(node);
//                }
//                result.add(current);
//            }
//        }
//
//        return result;

        // 2 递归
        return levelOrder(root, 0, new ArrayList<>());
    }

    private List<List<Integer>> levelOrder(Node node, int level, List<List<Integer>> order){
        if (node == null) return order;
        List<Integer> list = order.size() > level ?  order.get(level) : new ArrayList<>();
        list.add(node.val);
        if (order.size() <= level) {
            order.add(list);
        }
        if (node.children != null) {
            for (Node n : node.children){
                levelOrder(n, level + 1, order);
            }
        }
        return order;
    }
}
