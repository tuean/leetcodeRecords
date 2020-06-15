package com.tuean.Algorithm.DynamicProgramming;

public class Gold {

    // 最大金矿问题
    // 每座金矿总量不固定，需要不定个工人开采
    // 你只有n个工人，算出能获取金子的最大数量

    /**
     *
     *
     * @param w 工人数量
     * @param n 金矿数量
     * @param p 金矿开采所需工人数量
     * @param g 金矿储量
     * @return
     */
    public static int maxGold(int w, int n, int[] p, int[] g) {
        if (w < 1 || n < 1) return 0;
        if (w < p[n - 1]) {
            return maxGold(w, n - 1, p, g);
        }
        return Math.max(maxGold(w, n - 1, p, g), maxGold(w-p[n-1], n-1, p, g) + g[n-1]);
    }

    public static int maxGold2(int w, int[]p, int[] g) {
        int[] result = new int[w + 1];
        for (int x = 1; g.length > x; x++) {
            for (int y = w; y > 1; y--) {
                if (y > p[x - 1]) {
                    result[y] = Math.max(result[y], result[y - p[x - 1] + g[x - 1]]);
                }
            }
        }
        return result[w];
    }

}
