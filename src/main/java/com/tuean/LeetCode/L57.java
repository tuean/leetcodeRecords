package com.tuean.LeetCode;


import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class L57 {

    public static class Interval {
       int start;
       int end;
       Interval() { start = 0; end = 0; }
       Interval(int s, int e) { start = s; end = e; }
    }

    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if(intervals == null){
            return new ArrayList<>();
        }
        List<Interval> result = new ArrayList<>();
        int i = 0;
        // 找到所有比新的都小的值
        while(i < intervals.size() && intervals.get(i).end < newInterval.start){
            result.add(intervals.get(i));
            i++;
        }
        // 接下来找到有冲突的 进行合并
        while(i < intervals.size() && intervals.get(i).start <= newInterval.end){
            newInterval = new Interval(
                    Math.min(intervals.get(i).start, newInterval.start),
                    Math.max(intervals.get(i).end, newInterval.end)
            );
            i++;
        }
        result.add(newInterval);
        while(i < intervals.size()){
            result.add(intervals.get(i));
            i++;
        }

        return result;
    }


    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1, 3));
        list.add(new Interval(6, 9));
        System.out.println(JSON.toJSONString(insert(list, new Interval(2, 5))));
    }

}
