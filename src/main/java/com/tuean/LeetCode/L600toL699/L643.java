package com.tuean.LeetCode.L600toL699;

public class L643 {

    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length < k || k <= 0) return 0.0;
        int max = 0;
        int value = 0;
        for (int x = 0; x < k; x++) {
            value += nums[x];
        }
        int left = 0;
        int right = k;
        max = value;
        while (right < nums.length) {
            value = value - nums[left] + nums[right];
            max = Math.max(max, value);
            left++;
            right++;
        }
        return max / (double)k;
    }

    public static void main(String[] args) {
        findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4);
    }
}
