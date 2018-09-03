package com.tuean.LeetCode;

public class L397 {


    public int integerReplacement(int n) {
        if (n == Integer.MAX_VALUE) return 32;
        int result = 0;
        while (n > 1) {
            if (n % 2 == 0){
                n = n / 2;
            } else if ((n + 1) % 4 == 0 && n != 3) {
                n++;
            } else {
                n--;
            }
            result++;
        }
        return result;
    }

}
