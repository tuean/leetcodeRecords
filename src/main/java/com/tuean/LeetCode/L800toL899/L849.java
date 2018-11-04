package com.tuean.LeetCode.L800toL899;

public class L849 {


    // 这个题似曾相识
    // 就是找 连续0 的最大值 注意靠边的特例 这道题做过 有思路很舒服


    public int maxDistToClosest(int[] seats) {
        int left = 0, right = 0, result = 0, n = seats.length;
        for (; right < n; right++) {
            if (seats[right] == 1) {
                if (left == 0) {
                    // 左靠边
                    result = Math.max(result, right - left);
                } else {
                    result = Math.max(result, (right - left + 1) / 2);
                }
                left = right + 1;
            }
        }
        // 右靠边的特例
        return Math.max(result, n - left);
    }
}
