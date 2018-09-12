package com.tuean.LeetCode.L400toL499;

import java.util.Arrays;
import java.util.Comparator;

/**
 * question from
 * https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/
 *
 * resulved copy by
 * https://github.com/CyC2018/Interview-Notebook/blob/master/notes/Leetcode%20%E9%A2%98%E8%A7%A3.md
 *
 *
 * Created by zhongxiaotian on 2018/6/25.
 */
public class L452 {



//    Input:
//            [[10,16], [2,8], [1,6], [7,12]]
//
//    Output:
//            2

    // todo 这题没看懂 答案见下方

    // 看懂了 气球是有高度的 任一高度的匹配都算命中

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int cnt = 1, end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= end) {
                continue;
            }
            cnt++;
            end = points[i][1];
        }
        return cnt;
    }

}
