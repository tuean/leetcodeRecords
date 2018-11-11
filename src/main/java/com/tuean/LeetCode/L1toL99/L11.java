package com.tuean.LeetCode.L1toL99;

public class L11 {



    public int maxArea(int[] height) {

        int left = 0, right = height.length - 1, result = 0;
        while (left < right) {
            result = Math.max(result, (right - left) * (Math.min(height[left], height[right])));
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}
