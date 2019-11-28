package com.tuean.LeetCode.L100toL199;

public class L162 {

    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length < 2) return 0;
        int mid = 1, length = nums.length;
        while (mid + 1 < length) {
            if (nums[mid] == nums[mid + 1]) {
                mid += 2;
                continue;
            }
            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            mid++;
        }


        mid = 0;
        if (nums[mid] > nums[mid + 1]) {
            if (mid + 2 >= length || nums[mid + 1] != nums[mid + 1]) {
                return mid;
            }
        }

        mid = length - 1;
        if (nums[mid - 1] < nums[mid]) {
            if (mid - 2 < 0 || nums[mid - 1] != nums[mid - 2]) {
                return mid;
            }
        }

        return 0;
    }

}
