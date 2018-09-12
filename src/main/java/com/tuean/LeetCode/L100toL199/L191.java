package com.tuean.LeetCode.L100toL199;

public class L191 {

//    计算一个数转为二进制后1 的个数

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int ones = 0;
        while(n!=0) {
            ones += (n & 1); // and 运算
            n = n>>>1; // 向右移位 前面补零  0011 1100 >>> 2  0000 1111
//            n = n >> 1; //  todo 就会超时 ？？ 为什么呢
        }
        return ones;

//        int count = 0;
//        for(int i=0; i<32; i++){
//            count += (n >> i & 1) == 1 ? 1: 0;
//        }
//        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }
}
