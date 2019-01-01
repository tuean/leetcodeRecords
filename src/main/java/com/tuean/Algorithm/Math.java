package com.tuean.Algorithm;

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
}
