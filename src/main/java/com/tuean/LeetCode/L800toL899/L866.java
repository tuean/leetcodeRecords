package com.tuean.LeetCode.L800toL899;

public class L866 {

    // 这个题有点无聊

    public int primePalindrome(int N) {
        if (N == 1 || N == 2) return 2;
        if (N % 2 == 0) N++;
        while (true) {
            if (isPalindrome(N) && isPrime(N)) return N;
            N += 2;
            if (10_000_000 < N && N < 100_000_000)
                N = 100_000_001;
        }
    }


    public static boolean isPrime(int temp) {
        for (int i = 3; i*i <= temp; i+=2) {
            if (temp % i == 0) {
                return false;
            }
        }

        return true;
    }

    private boolean isPalindrome(int n) {
        if (n % 10 == 0 && n != 0) return false;
        int n1 = 0;
        while (n > n1) {
            n1 = n1 * 10 + (n % 10);
            n /= 10;
        }
        return n1 == n || n == n1 / 10;
    }
}
