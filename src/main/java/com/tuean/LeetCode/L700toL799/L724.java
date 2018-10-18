package com.tuean.LeetCode.L700toL799;

public class L724 {




    // 题目都没看懂 什么意思？？？？

    public int pivotIndex(int[] nums) {
        int total = 0, sum = 0;
        for (int num : nums) {
            total += num;
        }
        for (int i = 0; i < nums.length; sum += nums[i++]) {
            if (sum * 2 == total - nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
