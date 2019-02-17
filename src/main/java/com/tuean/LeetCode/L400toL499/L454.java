package com.tuean.LeetCode.L400toL499;

import java.util.HashMap;
import java.util.Map;

public class L454 {


    // 计算有多少个组合 每个队列各取一个数 相加结果为0
    // 四个数组大小一致

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if (A == null || B == null || C == null || D == null) return 0;
        int length = A.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x = 0; length > x; x++) {
            for (int y = 0; length > y; y++) {
                int value = A[x] + B[y];
                map.put(value, map.getOrDefault(value, 0) + 1);
            }
        }


        int result = 0;
        for (int x = 0; length > x; x++) {
            for (int y = 0; length > y; y ++) {
                int value = -(C[x] + D[y]);
                if (map.containsKey(value)) {
                    result += map.get(value);
                }
            }
        }

        return result;
    }


}
