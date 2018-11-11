package com.tuean.LeetCode.L1toL99;

public class L5 {


    // 找最长的回文子串



    // manacher's algorithm
//    public String longestPalindrome(String s) {
//        if (s == null || s.length() < 1) return "";
//        if (s.length() == 1) return s;
//
//
//
//
//    }




    // 每个点开始往外找 时间复杂度O(n2) 感觉时间复杂度有点高啊

    private int lo, maxLen;
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }


}
