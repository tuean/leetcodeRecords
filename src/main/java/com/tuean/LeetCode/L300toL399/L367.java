package com.tuean.LeetCode.L300toL399;

public class L367 {


    public boolean isPerfectSquare(int num) {
        Long index = 1L;
        Long result = 1L;
        while (num >= result) {
            result = index * index;
            if (num == result) {
                return true;
            }
            index++;
        }
        return false;
    }

}
