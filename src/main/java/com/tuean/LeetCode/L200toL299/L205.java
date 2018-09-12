package com.tuean.LeetCode.L200toL299;

public class L205 {

    // 判断两个字符串是否是同结构

    // todo 这个算法需要掌握

    public boolean isIsomorphic(String s, String t) {
        int[] a = new int[512];
        int[] b = new int[512];
        for (int x = 0; x < s.length(); x++) {
            if (a[s.charAt(x)] != b[t.charAt(x)]) return false;
            a[s.charAt(x)] = x+1;
            b[t.charAt(x)] = x+1;
        }
        return true;
    }
}
