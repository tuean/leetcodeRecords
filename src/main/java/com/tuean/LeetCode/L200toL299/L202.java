package com.tuean.LeetCode.L200toL299;

import java.util.HashSet;
import java.util.Set;

public class L202 {


//    快乐数字 就是拆开来每个数字平方  和==1 ： true



    public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        int squareSum,remain;
        while (inLoop.add(n)) {
            squareSum = 0;
            while (n > 0) {
                remain = n%10;
                squareSum += remain*remain;
                n /= 10;
            }
            if (squareSum == 1) return true;
            else n = squareSum;

        }
        return false;
    }

}
