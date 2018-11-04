package com.tuean.LeetCode.L800toL899;

public class L821 {


    // 这个题也很有趣

    // 一个算法 先从左边开始算 再从右边开始算

    public static int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] res = new int[n];
        int pos = -n;
        for (int x = 0; x < n; x++) {
            if (C == S.charAt(x)) {
                pos = x;
            } else {
                res[x] = x - pos;
            }
        }
        for (int x = n - 1; x > 0; x--) {
            if (C == S.charAt(x)) {
                pos = x;
            } else {
                res[x] = Math.min(res[x], Math.abs(x - pos));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(shortestToChar("loveleetcode", 'e'));
    }
}
