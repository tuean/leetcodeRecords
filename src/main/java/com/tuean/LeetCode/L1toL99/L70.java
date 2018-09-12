package com.tuean.LeetCode.L1toL99;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class L70 {

//    爬楼梯 1次可以 1 or 2 阶台阶
//    给定n  最多可以有多少种走法

//    打表找规律
//    if(n == 0 || n == 1 || n == 2){return n;}
//    int[] mem = new int[n];
//    mem[0] = 1;
//    mem[1] = 2;
//        for(int i = 2; i < n; i++){
//        mem[i] = mem[i-1] + mem[i-2];
//    }
//        return mem[n-1];

//    用dp来做

    public int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int x = 2; x < n; x++) {
            dp[x] = dp[x - 1] + dp[x - 2];
        }
        return dp[n - 1];
    }

}
