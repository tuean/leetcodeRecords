package com.tuean.LeetCode.L300toL399;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>title</h1> Longest Increasing Path in a Matrix
 *
 * @author zhongxiaotian
 */
public class L329 {


    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int length = matrix.length, width = matrix[0].length;
        if (length * width == 0) return 0;

        int max = 0;
        int[][] cache = new int[length][width];

        for (int x = 0; length > x; x++) {
            for (int y = 0; width > y; y++) {
                int len = dfs(matrix, x, y, length, width, cache);
                max = Math.max(len, max);
            }
        }
        return max;
    }

    public static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    private static int dfs(int[][] matrix, int x, int y, int length, int width, int[][] cache) {
        if (cache[x][y] != 0) return cache[x][y];
        int max = 1;
        for (int[] dir : dirs) {
            int a = x + dir[0], b = y + dir[1];
            if (a < 0 || b < 0 || a >= length || b >= width || matrix[a][b] <= matrix[x][y]) continue;
            int len = 1 + dfs(matrix, a, b, length, width, cache);
            max = Math.max(max, len);
        }
        cache[x][y] = max;
        return max;
    }

}
