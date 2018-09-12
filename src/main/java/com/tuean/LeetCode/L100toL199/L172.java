package com.tuean.LeetCode.L100toL199;

public class L172 {

//    计算n的阶乘末尾有几个0

//    也就是计算1到n中有多少个5
//    这个思路就很棒

    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
