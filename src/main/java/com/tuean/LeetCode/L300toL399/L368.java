package com.tuean.LeetCode.L300toL399;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L368 {


    public static List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int length = nums.length;
        if (length < 1) return result;
        Arrays.sort(nums);
        int[] dp = new int[length];
        dp[0] = 1;


        // dp[x] means the num that largest divisible subset of x
        for (int x = 1; length > x; x++) {
            for (int y = x - 1; y >= 0; y--) {
                if (nums[x] % nums[y] == 0) {
                    dp[x] = Math.max(dp[x], dp[y] + 1);
                }
            }
        }

        // get the max index of the largest subset
        int max = 0;
        for (int x = 0; length > x; x++) {
            max = dp[max] > dp[x] ? max : x;
        }

        // get the largest subset
        int maxValue = nums[max];
        int curDp = dp[max];
        for (int x = max; x >= 0; x--) {
            if (maxValue % nums[x] == 0 && dp[x] == curDp) {
                result.add(nums[x]);
                maxValue = nums[x];
                curDp--;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        largestDivisibleSubset(new int[]{1,2,3});
    }

}
