package com.tuean.LeetCode.L600toL699;

public class L680 {


    // 以为有什么更简单的方法 最后还是两层循环来做的

    public boolean validPalindrome(String s) {
        int l = -1, r = s.length();
        while (++l < --r) {
            if (s.charAt(l) != s.charAt(r)) {
                return isPalindromic(s, l, r+1) || isPalindromic(s, l-1, r);
            }
        }

        return true;
    }

    public boolean isPalindromic(String s, int l, int r) {
        while (++l < --r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
        }
        return true;
    }
}
