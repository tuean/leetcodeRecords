package com.tuean.LeetCode.L200toL299;

public class L204 {

//    找比n小的素数
//    算出那些不是素数的数 剩下的就是素数

    public int countPrimes(int n) {
        if (n < 2) return 0;
        int result = 0;
        boolean a[] = new boolean[n];
        for (int x = 2; x < n; x++) {
            if (!a[x]) {
                result++;
                for (int y = 0; y*x < n; y++) {
                    a[x*y] = true;
                }
            }
        }

        return result;
    }


    /**
     * 这个判断是否素数的方法很巧妙
     *
     * @param temp
     * @return
     */
    private boolean isPrime(int temp) {
        for (int i = 3; i*i <= temp; i+=2) {
            if (temp % i == 0) {
                return false;
            }
        }

        return true;
    }

}
