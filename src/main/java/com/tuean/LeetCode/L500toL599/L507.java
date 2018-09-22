package com.tuean.LeetCode.L500toL599;

import java.util.*;

public class L507 {


    // Input: 28
    // Output: True
    // Explanation: 28 = 1 + 2 + 4 + 7 + 14

    // 完美数 perfectNumber

    public static boolean checkPerfectNumber(int num) {
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        for (int x = 2; x < Math.sqrt(num); x++) {
//            if (num % x == 0) {
//                set.add(x);
//                set.add(num / x);
//            }
//        }
//
//        Optional<Integer> sum = set.stream().reduce(Integer::sum);

//        return sum.get() == num;


        if (num == 1) return false;
        Set<Integer> set = new HashSet<>();
        set.add(1);
        for (int x = 2; x <= Math.sqrt(num); x++) {
            if (num % x == 0) {
                set.add(x);
                set.add(num / x);
            }
        }

        int sum = 0;
        for (int i : set) {
            sum += i;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
}
