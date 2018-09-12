package com.tuean.LeetCode.L200toL299;

import java.util.HashMap;
import java.util.Map;

public class L217 {


    // 判断数组中是否有重复的数

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 1) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (map.get(x) > 1) return true;
        }
        return false;
    }

}
