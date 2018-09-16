package com.tuean.LeetCode.L200toL299;

public class L263 {

//    分解因数后只有2, 3, 5 参数的

    public boolean isUgly(int num) {
        if (num == 0) return false;
        while (num % 2 == 0) {
            num = num / 2;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        return num == 1;
    }
}
