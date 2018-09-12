package com.tuean.LeetCode.L200toL299;

public class L219 {


    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return false;
        for (int x = 0; x < nums.length; x++) {
            for (int y = x + 1; y < nums.length ; y++) {
                if (nums[x] == nums[y] && Math.abs(y - x) <= k) return true;
            }
        }
        return false;
    }
}
