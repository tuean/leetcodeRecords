package com.tuean.LeetCode.L300toL399;

public class L303 {


//    Given nums = [-2, 0, 3, -5, 2, -1]
//
//    sumRange(0, 2) -> 1
//    sumRange(2, 5) -> -1
//    sumRange(0, 5) -> -3


    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(i,j);
     */


    // 这题做的没意思

    int sum[];

    public L303(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        this.sum = nums;
    }

    public int sumRange(int i, int j) {
        if (i == 0) return sum[j];
        return sum[j] - sum[i - 1];
    }
}
