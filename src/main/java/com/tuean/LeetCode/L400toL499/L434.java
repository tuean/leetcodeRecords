package com.tuean.LeetCode.L400toL499;

public class L434 {


    // 计算除去空格之后的字段个数

    public int countSegments(String s) {
        if (s == null || s.trim().equals("")) return 0;
        return s.trim().split("\\s+").length;
    }
}
