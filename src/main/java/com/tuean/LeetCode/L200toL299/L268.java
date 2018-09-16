package com.tuean.LeetCode.L200toL299;

public class L268 {

//    Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

//    找唯一不同的 用异或


    public int missingNumber(int[] nums) {
        int xor = 0;
        for (int x = 0; x < nums.length; x++) {
            xor = xor ^ x ^ nums[x];
        }
        return xor ^ nums.length - 1;
    }
}
