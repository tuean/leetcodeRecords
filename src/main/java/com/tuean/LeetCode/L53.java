package com.tuean.LeetCode;

public class L53 {


//    Input: [-2,1,-3,4,-1,2,1,-5,4],
//    Output: 6
//    Explanation: [4,-1,2,1] has the largest sum = 6.
//    找和最大的
//    用DP来做


    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int x = 1; x < nums.length; x++) {
            dp[x] = nums[x] + (dp[x - 1] > 0 ? dp[x - 1] : 0);
            max = Math.max(dp[x], max);
        }
        return max;
    }
}
