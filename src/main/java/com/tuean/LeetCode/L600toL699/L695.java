package com.tuean.LeetCode.L600toL699;

public class L695 {

    public static int maxAreaOfIsland(int[][] grid) {
//        int [][] tmp = new int[grid.length][grid[0].length];
//        int count = 0;
//        int max = 0;
//        for (int x = 0; x < grid.length; x++) {
//            for (int y = 0; y < grid[0].length; y++) {
//                if (grid[x][y] == 1 && (x == 0 || y == 0 || tmp[x][y] == 0)) {
//                    if (tmp[x][y] == 0) {
//                        System.out.println(x + " " + y);
//                        count++;
//                        tmp[x][y] = 1;
//                    }
//                    if (y+1 < grid[0].length && grid[x][y+1] == 1) {
//                        tmp[x][y+1] = 1;
//                        System.out.println(x + " " + y + 1);
//                        count++;
//                    }
//                    if (x+1 < grid.length && grid[x+1][y] == 1) {
//                        tmp[x+1][y] = 1;
//                        System.out.println(x + 1 + " " + y);
//                        count++;
//                    }
//                } else {
//                    max = Math.max(max, count);
//                    count = 0;
//                }
//            }
//        }
//        max = Math.max(max, count);
//        return max;
        // todo  这道题应该很简单啊 啊。。
        return 0;
    }

    public static void main(String[] args) {
        maxAreaOfIsland(new int[][]{new int[]{1,1,0,1,1}, new int[]{1,0,0,0,0}, new int[]{0,0,0,0,1}, new int[]{1,1,0,1,1}});
    }
//    1,1,0,1,1
//    1,0,0,0,0
//    0,0,0,0,1
//    1,1,0,1,1
}
