package com.tuean.LeetCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class L225 {

    // todo 利用队列实现栈

    Queue<Integer> queue = new LinkedList<>();

    /** Initialize your data structure here. */
    public L225() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        for (int a = 0; a < queue.size(); a++) {
            queue.add(queue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }


    public static void main(String[] args) {
        L225 obj = new L225();
//        obj.push(x);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }
}
