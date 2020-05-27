package com.tuean.LeetCode.L1000toL1999;

public class L1009 {

    private static Integer[] source = new Integer[]{
            1,  // 0
            2,  // 1
            4,  // 2
            8,  // 3
            16, // 4
            32, // 5
            64, // 6
            128, // 7
            256, // 8
            512, // 9
            1024, // 10
            2048, // 11
            4096, // 12
            8192, // 13
            16384, // 14
            32768, // 15
            65536 // 16
    };

    public int bitwiseComplement(int N) {
        int x = 2;
        while (N >= x) {
            x = x * 2;
        }
        return x - N - 1;
    }

}
