package com.tuean.LeetCode.L300toL399;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.Comparator;

public class L354 {

    public static int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length < 1) return 0;
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0] == b[0]) {
                    return a[1] - b[1];
                }

                return a[0] - b[0];
            }
        });
        System.out.println(JSON.toJSONString(envelopes));
        int result = 1;
        int[] last = envelopes[0];

        for (int x = 1; envelopes.length > x; x++) {
            if (envelopes[x][0] > last[0] &&
                envelopes[x][1] > last[1]) {
                last = envelopes[x];
                System.out.println(JSON.toJSON(last));
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        maxEnvelopes(new int[][]{{5,4},{6,4},{6,7},{2,3}});
        maxEnvelopes(new int[][]{{2,100},{3,200},{4,300},{5,500},{5,400},{5,250},{6,370},{6,360},{7,380}});
//        maxEnvelopes(new int[][]{{30,50},{12,2},{3,4},{12,15}});
    }
}
