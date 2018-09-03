package com.tuean.LeetCode;

public class L463 {

//    只算右边和下边的
//    如果有相连1 就边数就 -1 默认边为4

    public static int islandPerimeter(int[][] grid) {
        int total = 0;
        int con = 0;
        if (grid == null) return 0;
        int x = grid.length;
        int y = grid[0].length;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == 1) {
                    ++total;
                    if (i < x - 1 && grid[i + 1][j] == 1) con++;
                    if (j < y - 1 && grid[i][j + 1] == 1) con++;
                }
            }
        }
        return total * 4 - con * 2;
    }

    public static void main(String[] args) {
        islandPerimeter(new int[][]{{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}});
    }
}
