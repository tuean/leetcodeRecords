package com.tuean.LeetCode.L200toL299;

public class L231 {


    // 判断一个数是否是2的倍数

    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n < 2) return false;

        while (n > 1) {
            if (n % 2 != 0) return false;
            n = n / 2;
        }
        return true;
    }
}
