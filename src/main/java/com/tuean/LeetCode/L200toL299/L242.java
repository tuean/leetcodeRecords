package com.tuean.LeetCode.L200toL299;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L242 {

    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        Map<Character, Integer> a = new HashMap<>();
        Map<Character, Integer> b = new HashMap<>();
        for (int x = 0; x < s.length(); x++) {
             a.put(s.charAt(x), a.getOrDefault(s.charAt(x), 0) + 1);
             b.put(t.charAt(x), b.getOrDefault(t.charAt(x), 0) + 1);
        }


    }
}
