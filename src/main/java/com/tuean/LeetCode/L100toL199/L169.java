package com.tuean.LeetCode.L100toL199;

import java.util.HashMap;
import java.util.Map;

public class L169 {

//    找出数组中出现次数最多的数

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i , map.getOrDefault(i, 0) + 1);
            if (map.get(i) > (nums.length / 2)) {
                return i;
            }
        }
        return -1;
    }
}
