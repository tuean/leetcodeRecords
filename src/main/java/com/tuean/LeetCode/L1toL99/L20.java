package com.tuean.LeetCode.L1toL99;

import java.util.Stack;

public class L20 {

//    Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{()}"));
    }

}
