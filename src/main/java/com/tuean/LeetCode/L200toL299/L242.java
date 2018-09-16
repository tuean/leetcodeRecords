package com.tuean.LeetCode.L200toL299;

import java.util.*;

public class L242 {

    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        int[] a = new int[26];
        for (int x = 0; x < s.length(); x++) {
             a[s.charAt(x) - 'a']++;
        }
        for (int x = 0; x < t.length(); x++) {
            a[s.charAt(x) - 'a']--;
        }
        for (int x : a) {
            if (x != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        isAnagram("a", "b");
    }
}
