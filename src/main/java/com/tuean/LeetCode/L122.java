package com.tuean.LeetCode;

public class L122 {

//    买卖问题2

    public int maxProfit(int[] prices) {
        int total = 0;
        for (int x = 0; x < prices.length - 1; x++) {
            total += Math.max(prices[x+1] - prices[x], 0);
        }
        return total;
    }
}
