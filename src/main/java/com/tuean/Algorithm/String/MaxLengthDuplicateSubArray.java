package com.tuean.Algorithm.String;

public class MaxLengthDuplicateSubArray {

    // 最长重复子数组

    // 相等的划线一定是左上向右下
    // 比较 A[x] == B[y]
    // 相等时， 左上角值 + 1

    public int findLength(int[] A, int[] B) {
        int n = A.length, m = B.length, ans = 0;
        int[][] dp = new int[n + 1][m +1];
        for (int i = 1; n >= i; i++) {
            for (int j = 1; m >= j; j++) {
                dp[i][j] = A[i - 1] == B[j - 1] ? dp[i -1][j - 1] + 1 : 0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }


    // 官方题解
    public int findLength2(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[][] dp = new int[n + 1][m + 1];
        int ans = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                dp[i][j] = A[i] == B[j] ? dp[i + 1][j + 1] + 1 : 0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }


}
