package com.tuean.Algorithm.sort;

public class BubbleSort {

    // 冒泡排序

    public static int[] sort(int[] nums) {
        if (nums == null || nums.length < 1) return nums;
        boolean flag = false;
        for (int x = 0; nums.length - 1 > x; x++) {
            flag = false;
            for (int y = 0; nums.length - 1 > y; y++) {
                int tmp = 0;
                if (nums[y] > nums[y+1]) {
                    tmp = nums[y];
                    nums[y] = nums[y+1];
                    nums[y+1] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(sort(new int[]{3, 1, 6, 0}));
    }


}
