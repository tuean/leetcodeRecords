package com.tuean.LeetCode;

public class L26 {

//    Remove Duplicates from Sorted Array
//    不能新申请一个数组 空间复杂度为O(1)

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int result = 1;
        int index = 1;
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != last) {
                last = nums[i];
                result ++;
                nums[index] = nums[i];
                if (index != i) nums[i] = 0;
                index++;
            } else {
                last = nums[i];
                nums[i] = 0;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }
}
