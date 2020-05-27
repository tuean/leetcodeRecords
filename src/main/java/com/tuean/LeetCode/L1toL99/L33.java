package com.tuean.LeetCode.L1toL99;

public class L33 {


    // 这个题蛮有意思的
    // 变种 brinary search


//    Input: nums = [4,5,6,7,0,1,2], target = 0
//    Output: 4
//    Input: nums = [4,5,6,7,0,1,2], target = 3
//    Output: -1

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;

            if (nums[mid] < target) {
                if (nums[left] < target && nums[left] > nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[right] > target && nums[mid] > nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
