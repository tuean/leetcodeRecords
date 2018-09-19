package com.tuean.LeetCode.L400toL499;

public class L409 {

    // 找s中的字符能组成的最长回文子串长度
    // s中包含大些字符和小写字符

    public static int longestPalindrome(String s) {
        boolean[] map = new boolean[128];
        int result = 0;
        for (Character x : s.toCharArray()) {
            map[x] = !map[x];
            if (!map[x]) result++;
        }
        if (result * 2 < s.length()) return result * 2 + 1;
        return result * 2;
    }

    public static void main(String[] args) {
        longestPalindrome("bb");
    }
}
