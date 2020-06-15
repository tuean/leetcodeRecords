package com.tuean.Algorithm.Math;

public class Math {

    /**
     * 这个判断是否素数的方法很巧妙
     *
     * @param temp
     * @return
     */
    public static boolean isPrime(int temp) {
        for (int i = 3; i*i <= temp; i+=2) {
            if (temp % i == 0) {
                return false;
            }
        }

        return true;
    }


    /**
     * 辗转相除法
     *
     * @param a
     * @param b
     * @return
     */
    public static int maxCommonDivisor(int a, int b) {
        int big = a > b ? a : b;
        int small = a > b ? b : a;
        if (big % small == 0) return small;
        return maxCommonDivisor(big % small, small);
    }

    /**
     * 更相减损术
     *
     * @param a
     * @param b
     * @return
     */
    public static int maxCommonDivisor2(int a, int b) {
        int big = a > b ? a : b;
        int small = a > b ? b : a;
        if (big == small) return big;
        return maxCommonDivisor2(a - b, b);
    }

    /**
     * 判断是否是2的次幂
     *
     * @param x
     * @return
     */
    public static boolean if2Power(int x) {
        // x(hex) = 10000...0
        // x - 1(hex) = 11111...1
        return (x - 1 & x) == 0;
    }

    /**
     * 去除k个数字后剩下的值尽可能小
     *
     * @param num
     * @param k
     * @return
     */
    public static String removeKDigits(String num, int k) {
        int newLength = num.length() - k;
        char[] stack = new char[num.length()];
        int index = 0;
        for (int x = 0; num.length() > x; x++) {
            char instant = num.charAt(x);
            while (index > 0 && stack[index - 1] > instant && k > 0) {
                k--;
                index--;
            }
            stack[index] = instant;
            index++;
        }
        int offset = 0;
        while (offset < newLength && stack[offset] == '0') {
            offset++;
        }
        return offset == newLength ?
                "0" :
                new String(stack, offset, newLength - offset);
    }

    public static void main(String[] args) {
        System.out.println(removeKDigits("1593212", 3));
    }
}
