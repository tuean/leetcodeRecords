package com.tuean.LeetCode.L800toL899;

public class L887 {

//      https://zxi.mytechroad.com/blog/?s=Super+Egg+Drop

//      给K个鸡蛋 求一个F值
//      1 <= F <= N
//      鸡蛋在小与F位置处往下掉不会碎
//      鸡蛋在大于F位置处往下掉会碎
//      求一个最小的操作次数 使得我们可以确定F值的大小
//      第一个想法是用二分查找

//    但是结果不对
    public static int superEggDropBinarySearch(int K, int N){
        int[][] memo = new int[K + 1][N + 1];
        return helper(K, N, memo);
    }

    public static int helper(int K, int N, int[][] memo){
        if (N <= 1) return N;
        if (K == 1) return K;
        if (memo[K][N] > 0) return memo[K][N];

        int min = N;
        for (int i = 1; i <= N; i++) {
            int left = helper(K - 1, i - 1, memo);
            int right = helper(K, N - i, memo);
            min = Math.min(min, Math.max(left, right) + 1);
        }
        memo[K][N] = min;
        return min;
    }

//    dp[k][n] = min(1 + max(dp[k - 1][i - 1], dp[k][n - i])) i = 1...n



//    DP1
//    dp[m][k] 表示给定K个鸡蛋 和 M 移动次数，dp[m][k]的值表示我们所能确认的最大的floor值
//    dp[m][k] = dp[m - 1][k - 1] + dp[m - 1][k] + 1
//    重要的是推导出上述公式
//    鸡蛋碎了 检查dp[m - 1][k - 1]
//    没碎    检查dp[m - 1][k - 1]

//    https://juejin.im/post/5b98785de51d450e71250aab?utm_source=gold_browser_extension

    public static int superEggDrop(int K, int N) {
        int[][] dp = new int[N + 1][K + 1];
        int m = 0;
        while (dp[m][K] < N) {
            ++m;
            for (int k = 1; k <= K; ++k) {
                dp[m][k] = dp[m - 1][k - 1] + dp[m - 1][k] + 1;
            }
        }
        return m;
    }

//    DP2
//    dp[k][n] = min(1 + max(dp[k][i – 1], dp[k – 1][n – i])) 1 <= i <= n
//    public static int superEggDrop2(int K, int N) {
//        int[][] dp = new int[K + 1][N + 1];
//        return dp(K, N, dp);
//    }
//
//    public static int dp(int K, int N, int[][] dp){
//        if (K <= 0) return 0;
//        if (K == 1) return N;
//        if (N <= 1) return N;
//        if (dp[K][N] > 0) return dp[K][N];
//
//        int anx = Integer.MAX_VALUE;
//        for (int i = 0; i <= N; ++i) {
//            anx = Math.min(anx, 1 + Math.max(K - 1, i - 1)); // broken at floor i, need to test i - 1 floors using k - 1 eggs.
//            anx = Math.min(anx, dp(K, N - 1, dp)); // unbroken at floor i, need to test n - i floors using k eggs.
//        }
//        return dp[K][N] = anx;
//    }

    public static void main(String[] args) {
        System.out.println(superEggDrop(2, 6));
    }
}
