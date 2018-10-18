package com.tuean.LeetCode.L700toL799;

public class L746 {



    // 有点意思 回家看看

    // 这老哥so diao

    // dp + 贪心

    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }

}
