package com.tuean.LeetCode;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * question from
 *
 * Created by zhongxiaotian on 2018/6/25.
 */
public class L406 {

//    Input:
//            [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
//
//    Output:
//            [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]

//    身高降序、k 值升序，然后按排好序的顺序插入队列的第 k 个位置中


    public static int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) {
            return new int[0][0];
        }
        Arrays.sort(people, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
        System.out.println(JSON.toJSONString(people));
        List<int[]> queue = new ArrayList<>();
        for (int[] p : people) {
            queue.add(p[1], p);
        }
        return queue.toArray(new int[queue.size()][]);
    }

    public static void main(String[] args) {
        int[][] people = new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        System.out.println(JSON.toJSONString(reconstructQueue(people)));
    }
}
