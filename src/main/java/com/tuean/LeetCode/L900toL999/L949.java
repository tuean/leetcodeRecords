package com.tuean.LeetCode.L900toL999;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L949 {


    public static String largestTimeFromDigits(int[] A) {
        int res1 = -1, res2 = -1, res3 = -1, res4 = -1;
        Arrays.sort(A);
        for (int x = 1; A.length > x; x++) {
            if (A[x - 1] <= 2 && A[x] > 2) {
                res1 = x - 1;
            }
        }
        if (res1 < 0) return "";

        // todo 

        if (res2 < 0) return "";

        int r1 = 3 - res1, r2 = 3 - res2;
        int minutes = A[r1] * 10 + A[r2];
        if (minutes < 60 && A[res1] != 2 && A[res2] != 4) {
            return A[res1] + A[res2] + ":" + minutes;
        }
        minutes = A[r2] * 10 + A[r1];
        if (minutes < 60 && A[res1] != 2 && A[res2] != 4) {
            return A[res1] + A[res2] + ":" + minutes;
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(largestTimeFromDigits(new int[]{1,2,3,4}));
    }


}
