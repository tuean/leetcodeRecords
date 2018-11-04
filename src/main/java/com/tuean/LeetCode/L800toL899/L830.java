package com.tuean.LeetCode.L800toL899;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L830 {



    public static List<List<Integer>> largeGroupPositions(String S) {
        if( S == null || S.length() < 3) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        int left = 0;
        int right = 0;
        char last = S.charAt(0);
        for (int x = 1; x < S.length(); x++) {
            if (S.charAt(x) == last) {
                right++;
            } else {
                if (right - left >= 2) {
                    result.add(Arrays.asList(left, right));
                }
                left = x;
                right = x;
            }
            last = S.charAt(x);
        }
        if (right - left >= 2) {
            result.add(Arrays.asList(left, right));
        }
        return result;


//        人家写的 更简单
//        int i = 0, j = 0, N = S.length();
//        List<List<Integer>> res = new ArrayList<>();
//        while (j < N) {
//            while (j < N && S.charAt(j) == S.charAt(i)) ++j;
//            if (j - i >= 3) res.add(Arrays.asList(i, j - 1));
//            i = j;
//        }
//        return res;
    }

    public static void main(String[] args) {
        largeGroupPositions("aaa");
    }

}
