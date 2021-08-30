package com.tuean.Algorithm.Math;

public class BitOperation {

    // 异或 ^= 相同位得0 不同位得1

    // 一串数字里面有2个整数出现奇数次，其他数出现偶数次

    public static int[] findLostNum(int[] nums) {
        int[] result = new int[2];
        int xorResult = 0;
        for (int x : nums) {
            xorResult ^= x;
        }

        int a = 1;
        while ((xorResult & a) == 0) {
            a = a << 1;
        }

        for (int x : nums) {
            if ((xorResult & x) == 0) {
                result[0] ^= x;
            } else {
                result[1] ^= x;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(1^1);
        System.out.println(1^0);
        System.out.println(0^0);
    }




}
