package com.tuean.LeetCode.L400toL499;

public class L461 {


//    Input: x = 1, y = 4
//
//    Output: 2
//
//      Explanation:
//      1   (0 0 0 1)
//      4   (0 1 0 0)
//              ↑   ↑

//    判断两个数字转为二进制之后不同的位数

    public int hammingDistance(int x, int y) {

        // 第一时间想到了异或 但是没有用过 bitCount 这个方法
        return Integer.bitCount(x ^ y);
    }

}
