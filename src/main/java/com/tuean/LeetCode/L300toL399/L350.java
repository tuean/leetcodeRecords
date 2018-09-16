package com.tuean.LeetCode.L300toL399;

import java.util.ArrayList;
import java.util.HashMap;

public class L350 {

    // 找两个数组的交点

    // 有多少个重复就输出多少个


    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int i : nums2) {
            int x = map.get(i) == null ? 0 : map.get(i);
            if(x > 0) {
                result.add(i);
                map.put(i, map.get(i)-1);
            }
        }

        int[] r = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            r[i] = result.get(i);
        }

        return r;
    }
}
