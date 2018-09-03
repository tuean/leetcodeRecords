package com.tuean.LeetCode;

import java.util.Arrays;

public class L581 {


    public int findUnsortedSubarray(int[] nums) {
        int[] numsClone = nums.clone();
        Arrays.sort(numsClone);
        int start = 0;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] != numsClone[x]) {
                start = x;
                break;
            }
        }
        int end = 0;
        for (int x = nums.length - 1; x > 0; x--) {
            if (nums[x] != numsClone[x]) {
                end = x;
                break;
            }
        }
        return end <= start ? 0 : end - start + 1;
    }

}
