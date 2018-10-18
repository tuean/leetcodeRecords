package com.tuean.LeetCode.L600toL699;

import java.util.ArrayList;
import java.util.List;

public class L633 {

    public boolean judgeSquareSum(int c) {
        // 性能不行
//        List<Integer> list = new ArrayList<>();
//        for (int x = 0; x <= Math.sqrt(c); x++) {
//            list.add(x * x);
//            if (list.contains(c - x * x)) {
//                return true;
//            }
//        }
//        return false;

        // 用快慢指针来搞 逼近最后的结果
        if (c < 0) {
            return false;
        }
        int left = 0, right = (int)Math.sqrt(c);
        while (left <= right) {
            int cur = left * left + right * right;
            if (cur < c) {
                left++;
            } else if (cur > c) {
                right--;
            } else {
                return true;
            }
        }
        return false;
    }
}
