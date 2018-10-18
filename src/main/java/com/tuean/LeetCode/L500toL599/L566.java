package com.tuean.LeetCode.L500toL599;

public class L566 {


    // matlab 中的 reshape 函数实现
    // 关键就是点坐标的对应

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r*c != n*m) return nums;
        int[][] res = new int[r][c];
        for (int i=0;i<r*c;i++) {
            res[i/c][i%c] = nums[i/m][i%m];
        }
        return res;
    }
}
