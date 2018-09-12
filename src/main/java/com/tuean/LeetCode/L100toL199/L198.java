package com.tuean.LeetCode.L100toL199;

public class L198 {

//    Input: [2,7,9,3,1]
//    Output: 12
//    Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
//    Total amount you can rob = 2 + 9 + 1 = 12.
//    只能间隔间隔的抢

//    todo 这个是真没看懂

    public int rob(int[] num) {
        int[][] dp = new int[num.length + 1][2];
        for (int i = 1; i <= num.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = num[i - 1] + dp[i - 1][0];
        }
        return Math.max(dp[num.length][0], dp[num.length][1]);
    }

//    dp[i][1] means we rob the current house and dp[i][0] means we don't,
//
//    so it is easy to convert this to O(1) space

    public int rob1(int[] num) {
        int prevNo = 0;
        int prevYes = 0;
        for (int n : num) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = n + temp;
        }
        return Math.max(prevNo, prevYes);
    }
}
