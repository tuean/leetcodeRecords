package com.tuean.LeetCode.L300toL399;

public class L387 {

    // 找唯一的字符的位置 如果没有返回 -1

    public int firstUniqChar(String s) {
        int[] letters = new int[26];
        for (int x = 0; x < s.length(); x++) {
            letters[s.charAt(x) - 'a']++;
        }

        for (int x = 0; x < s.length(); x++) {
            if (letters[s.charAt(x) - 'a'] == 1) {
                return x;
            }
        }

        return -1;
    }
}
