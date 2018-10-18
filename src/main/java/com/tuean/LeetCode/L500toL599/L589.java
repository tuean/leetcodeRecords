package com.tuean.LeetCode.L500toL599;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L589 {

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    // 和 590 类似
    // 用循环来写
    // stack 后进先出

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            list.add(node.val);
            if (node.children != null) {
                for (int x = node.children.size(); x >= 0; x--) {
                    stack.add(node.children.get(x));
                }
            }

        }
        return list;
    }
}
