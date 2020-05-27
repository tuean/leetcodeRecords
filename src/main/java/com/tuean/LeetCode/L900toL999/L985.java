package com.tuean.LeetCode.L900toL999;

public class L985 {


    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        if (A == null) return new int[0];
        int[] result = new int[A.length];
        int total_instant = 0;
        for (int x : A) {
            total_instant += x % 2 == 0 ? x : 0;
        }

        int length = queries.length;
        for (int x = 0; length > x; x++) {
            int[] temp = queries[x];
            int toAdd = temp[0];
            int old = A[temp[1]];
            int newVal = old + toAdd;
            A[temp[1]] = newVal;
            total_instant -= old % 2 == 0 ? old : 0;
            total_instant += newVal % 2 == 0 ? newVal : 0;
            result[x] = total_instant;
        }
        return result;
    }


}
