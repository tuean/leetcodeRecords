package com.tuean.LeetCode.L400toL499;

public class L459 {


    // 判断该字符串是否是重复的字符串组成

    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, s.length() * 2 - 1).contains(s);
    }
}
