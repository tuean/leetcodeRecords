package com.tuean.LeetCode.L800toL899;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class L884 {


    // 直接把两边加起来一起计算就好了
    // 代码直接抄discuss了

    public String[] uncommonFromSentences(String A, String B) {

        // 直接把两边加起来一起计算就好了
        // 代码直接抄discuss了
        Map<String, Integer> count = new HashMap<>();
        for (String w : (A + " " + B).split(" ")) {
            count.put(w, count.getOrDefault(w, 0) + 1);
        }

        ArrayList<String> res = new ArrayList<>();
        for (String w : count.keySet()) {
            if (count.get(w) == 1) {
                res.add(w);
            }
        }
        return res.toArray(new String[0]);
    }
}
