package com.tuean.LeetCode.L700toL799;

public class L704 {

//  Given a sorted (in ascending order) integer array nums of n elements and a target value,
//  write a function to search target in nums。
//  If target exists, then return its index, otherwise return -1.

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int x = (high + low) / 2;
            if (nums[x] == target) {
                return x;
            } else if (nums[x] > target) {
                high = x - 1;
            } else if (nums[x] < target) {
                low = x + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}
