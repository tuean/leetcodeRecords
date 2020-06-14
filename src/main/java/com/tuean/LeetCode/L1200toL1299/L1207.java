package com.tuean.LeetCode.L1200toL1299;

import java.util.HashMap;
import java.util.Map;

public class L1207 {


    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 1) + 1);
        }

        boolean[] flag = new boolean[1000];
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            if (flag[value]) return false;
            flag[value] = true;
        }
        return true;
    }

}
