package com.tuean.LeetCode.L700toL799;

import java.util.ArrayList;
import java.util.List;

public class L728 {


    public static List<Integer> selfDividingNumbers(int left, int right) {
        // 简单 快下班了 懒得做了

        if (left > right) return new ArrayList<>(0);
        List<Integer> result = new ArrayList<>(right - left);
        for (int x = left; right >= x; x++) {
            if (checkSelfDivision(x)) result.add(x);
        }
        return result;
    }

    private static boolean checkSelfDivision(int s) {
        String ss = Integer.toString(s);
        int length = ss.length();
        for (int x = 0; length > x; x++) {
            if ('0' == ss.charAt(x)) return false;
            if (s % Integer.parseInt(ss.substring(x, x+ 1)) != 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }


}
