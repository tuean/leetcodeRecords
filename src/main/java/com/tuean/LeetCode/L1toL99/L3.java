package com.tuean.LeetCode.L1toL99;

import java.util.HashSet;

public class L3 {


    // 求不重复的最长子字符串
    // sliding windows

    public int lengthOfLongestSubstring(String s) {
        if (s == null) return 0;
        if (s.length() < 2) return s.length();

        HashSet<Character> set = new HashSet<>();
        int max = 0, i = 0, start = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
            } else {
                max = Math.max(max, set.size());
                while (start < i && s.charAt(start) != c) {
                    set.remove(s.charAt(start));
                    start++;
                }
                start++;
            }
            i++;
        }
        return Math.max(max, set.size());
    }
}
