package com.tuean.LeetCode.L300toL399;

public class L371 {

    // 不用加号算加法

    // todo 看不懂看不懂 学不会学不会

    public static int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }


    public static void main(String[] args) {
        System.out.print(getSum(1, 2));
    }
}
