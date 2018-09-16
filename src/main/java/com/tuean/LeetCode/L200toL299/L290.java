package com.tuean.LeetCode.L200toL299;

import java.util.HashMap;
import java.util.Map;

public class L290 {

    public boolean wordPattern(String pattern, String str) {
        String[] ss = str.split(" ");
        if (ss.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        for (int x = 0; x < pattern.length(); x++) {
            if (map.containsKey(pattern.charAt(x))) {
                String tmp = map.get(pattern.charAt(x));
                if (!tmp.equals(ss[x])) return false;
            } else {
                if (map.containsValue(ss[x])) return false;
                map.put(pattern.charAt(x), ss[x]);
            }
        }

        return true;
    }
}
