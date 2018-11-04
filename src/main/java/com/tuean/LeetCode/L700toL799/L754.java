package com.tuean.LeetCode.L700toL799;

public class L754 {


    // 找规律 先同一个方向 最后看差几

    public int reachNumber(int target) {
        target = Math.abs(target);
        int step = 0;
        int sum = 0;
        while (sum < target) {
            step++;
            sum += step;
        }
        while ((sum - target) % 2 != 0) {
            step++;
            sum += step;
        }
        return step;
    }

}
