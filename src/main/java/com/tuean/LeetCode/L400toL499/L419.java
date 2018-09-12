package com.tuean.LeetCode.L400toL499;

public class L419 {

//    这道题和之前一道二维数组找最小路径的一样，循环中只看当前点右侧和下侧的点的值

    public int countBattleships(char[][] board) {
        if (board == null || board.length == 0) return 0;
        int count = 0;

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[0].length; y++) {
                if (board[x][y] == '.') continue;
                if (x > 0 && board[x - 1][y] == 'X') continue;
                if (y > 0 && board[x][y - 1] == 'X') continue;
                count++;
            }
        }
        return count;
    }


}
