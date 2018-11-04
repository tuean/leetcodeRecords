package com.tuean.LeetCode.L700toL799;

import com.alibaba.fastjson.JSON;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L784 {


    // 这个题目挺有意思


    // 值得学习


    //BFS
    public static List<String> letterCasePermutation(String S) {
        if (S == null) {
            return new LinkedList<>();
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(S);

        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) continue;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String cur = queue.poll();
                char[] chs = cur.toCharArray();

                chs[i] = Character.toUpperCase(chs[i]);
                queue.offer(String.valueOf(chs));

                chs[i] = Character.toLowerCase(chs[i]);
                queue.offer(String.valueOf(chs));
            }
        }

        return new LinkedList<>(queue);
    }

    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(letterCasePermutation("a2B")));
    }


    //DFS
    public List<String> letterCasePermutation2(String S) {
        if (S == null) {
            return new LinkedList<>();
        }

        List<String> res = new LinkedList<>();
        helper(S, res, 0);
        return res;
    }

    public void helper(String s, List<String> res, int pos) {
        if (pos == s.length()) {
            res.add(s);
            return;
        }
        if (s.charAt(pos) >= '0' && s.charAt(pos) <= '9') {
            helper(s, res, pos + 1);
            return;
        }

        char[] chs = s.toCharArray();
        chs[pos] = Character.toLowerCase(chs[pos]);
        helper(String.valueOf(chs), res, pos + 1);

        chs[pos] = Character.toUpperCase(chs[pos]);
        helper(String.valueOf(chs), res, pos + 1);
    }

}
