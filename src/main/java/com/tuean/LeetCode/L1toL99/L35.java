package com.tuean.LeetCode.L1toL99;

public class L35 {

    public static int searchInsert(int[] nums, int target) {
        for (int x = 0; x < nums.length; x++) {
            if (nums[0] > target) return 0;
            if (nums[x] >= target) return x;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

}
