package com.tuean.Algorithm.sort;

public class CountSort {

    // 计数排序

    public static int[] sort(int[] nums) {
        if (nums == null || nums.length < 1) return nums;
        int max = nums[0];
        for (int x : nums) {
            max = Math.max(x, max);
        }

        int[] t = new int[max + 1];

        for (int x : nums) {
            t[x]++;
        }

        int[] result = new int[nums.length];
        int index = 0;
        for (int x = 0; t.length > x; x++) {
            if (t[x] == 0) continue;
            for (int y = 0; t[x] > y; y++) {
                result[index] = x;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sort(new int[]{3, 1, 6, 0}));
    }


}
