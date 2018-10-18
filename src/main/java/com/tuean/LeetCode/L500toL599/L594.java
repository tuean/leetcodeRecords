package com.tuean.LeetCode.L500toL599;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class L594 {

//    harmonious
//  找出每个间隔为1的最大长度

    public static int findLHS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if (map.containsKey((Integer) entry.getKey() + 1)) {
                max = Math.max(max, map.get(entry.getKey()) + map.get((Integer) entry.getKey() + 1));
            }
        }
        return max;
    }


    public static void main(String[] args) {
        findLHS(new int[]{1,2,3,4});
    }
}

