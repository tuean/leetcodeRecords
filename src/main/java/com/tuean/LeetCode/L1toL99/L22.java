package com.tuean.LeetCode.L1toL99;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class L22 {


    // todo 大概知道思路 但是还是没想明白

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public static void backtrack(List<String> list, String str, int open, int close, int max){
        if(str.length() == max*2){
            list.add(str);
            return;
        }
        if(open < max) {
            backtrack(list, str+"(", open+1, close, max);
        }
        if(close < open) {
            backtrack(list, str+")", open, close+1, max);
        }
    }


    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(generateParenthesis(3)));
    }
}
