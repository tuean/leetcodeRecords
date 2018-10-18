package com.tuean.LeetCode.L500toL599;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class L590 {


    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };


    // 和 589 类似
    // 题目要求用循环的方法做

    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while(!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            for(Node node: root.children) {
                stack.add(node);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
