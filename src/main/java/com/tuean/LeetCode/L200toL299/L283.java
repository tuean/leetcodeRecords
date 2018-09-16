package com.tuean.LeetCode.L200toL299;

public class L283 {

    // 把数组中的0 挪到后面去

    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int x : nums) {
            if (x != 0) {
                nums[index] = x;
            }
            index++;
        }
        while (index < nums.length) {
            nums[index] = 0;
        }
    }
}
