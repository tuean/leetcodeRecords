package com.tuean.LeetCode.L200toL299;

public class L238 {

    public static int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length < 1) return new int[0];
        int length = nums.length;
        int temp = 1;
        int[] result = new int[length];
        for (int x = 0; length > x; x++) {
            result[x] = temp;
            temp *= nums[x];
        }

        temp = 1;
        for (int x = length; x > 0; x--) {
            result[x] *= temp;
            temp *= nums[x];
        }
        return result;
    }


//    public static int[] productExceptSelf(int[] nums) {
//        if (nums == null || nums.length < 1) return new int[0];
//        int max = 1;
//        for (int x : nums) {
//            if (x != 0) {
//                max *= x;
//            }
//        }
//
//        int[] result = new int[nums.length];
//        for (int x = 0; nums.length > x; x++) {
//            if (nums[x] == 0) {
//                result[x] = 0;
//            } else {
//                result[x] = max / nums[x];
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(productExceptSelf(nums));
    }

}
