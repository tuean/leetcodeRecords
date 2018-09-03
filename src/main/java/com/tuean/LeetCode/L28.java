package com.tuean.LeetCode;

public class L28 {

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || needle.length() > haystack.length()) return -1;
        if (haystack.length() == 0 || needle.length() == 0) return 0;
        for (int x = 0; x < haystack.length(); x++) {
            int a = x;
            for (int y = 0; y < needle.length(); y++) {
                if (a >= haystack.length() || haystack.charAt(a) != needle.charAt(y)) {
                    break;
                }
                if (haystack.charAt(a) == needle.charAt(y)) {
                    a++;
                }
                if (y == needle.length() - 1) return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issipi"));
    }
}
