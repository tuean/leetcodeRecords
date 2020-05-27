package com.tuean.LeetCode.L1toL99;

public class L34 {

    //  直接就是前后两次二分查找

//    Input: nums = [5,7,7,8,8,10], target = 8
//    Output: [3,4]

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[]{-1, -1};
        int left = 0, right = nums.length - 1;
        int rleft = -1, rright = -1;

        // left position
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] != target) return result;
        rleft = left;

        // right
        left = 0; right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2 + 1;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        if (nums[right] != target) return result;
        rright = right;

        return new int[]{rleft, rright};
    }


    public static void main(String[] args) {
        L34 l = new L34();
        System.out.println(l.searchRange(new int[]{5,7,7,8,8,10}, 8));
    }

}
