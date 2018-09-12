package com.tuean.LeetCode.L400toL499;



import sun.jvm.hotspot.utilities.Interval;

import java.util.Arrays;
import java.util.Comparator;

/**
 * question from
 * https://leetcode.com/problems/non-overlapping-intervals/description/
 *
 * resolved copy by
 * https://github.com/CyC2018/Interview-Notebook/blob/master/notes/Leetcode%20%E9%A2%98%E8%A7%A3.md
 *
 *
 * Created by zhongxiaotian on 2018/6/25.
 */
public class L435 {

//    Input: [ [1,2], [1,2], [1,2] ]
//
//    Output: 2
//
//    Explanation: You need to remove two [1,2] to make the rest of intervals non-overlapping.
//            Input: [ [1,2], [2,3] ]
//
//    Output: 0
//
//    Explanation: You don't need to remove any of the intervals since they're already non-overlapping.

    public int eraseOverlapIntervals(Interval[] intervals) {
        if(intervals == null || intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return (Integer) o1.getHighEndpoint() - (Integer) o2.getHighEndpoint();
            }
        });
        int cnt = 1;
        int end = (int) intervals[0].getHighEndpoint();
        for(int x = 1; x < end; x++){
            if((Integer) intervals[x].getLowEndpoint() < end){
                continue;
            }
            end = (int) intervals[x].getHighEndpoint();
            cnt++;
        }
        return intervals.length - cnt;
    }


}
