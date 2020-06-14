package com.tuean.Algorithm.sort;

public class QuickSort {

    // 快排

    public static int[] sort(int[] nums) {
        if (nums == null || nums.length < 1) return nums;
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }


    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int index = partition(nums, left, right);
        quickSort(nums, left, index - 1);
        quickSort(nums, index + 1, right);
    }

    public static int partition(int[] nums, int left, int right) {
        int base = nums[left];
        int l = left;
        int r = right;
        while (l != r) {
            while (l < r && nums[r] > base) {
                r--;
            }
            while (l < r && nums[r] < base) {
                l++;
            }
            if (l < r) {
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
            }
        }

        nums[left] = nums[l];
        nums[l] = base;

        return l;
    }
}
