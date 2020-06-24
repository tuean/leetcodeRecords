package com.tuean.Algorithm.DynamicProgramming;

public class Frog {


    // 青蛙一次能跳1级 或者 2级， 跳上n级一共可以有多少种跳法

    public int numWays(int n) {
        if (n <= 1) return 1;
        if (n < 3) return n;
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        for (int x = 3; n > x; x++) {
            result[x] = result[x - 1] + result[x - 2];
        }
        return result[n];
    }


}
