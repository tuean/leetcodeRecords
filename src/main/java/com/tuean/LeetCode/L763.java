package com.tuean.LeetCode;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhongxiaotian on 2018/6/25.
 */
public class L763 {

//    Input: S = "ababcbacadefegdehijhklij"
//    Output: [9,7,8]
//    Explanation:
//    The partition is "ababcbaca", "defegde", "hijhklij".
//    This is a partition so that each letter appears in at most one part.
//    A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.


    public static List<Integer> partitionLabels(String S) {
        int[] lastIndexsOfChar = new int[26];
        for (int i = 0; i < S.length(); i++) {
            // 每个字母最后出现的位置
            lastIndexsOfChar[char2Index(S.charAt(i))] = i;
        }
        List<Integer> partitions = new ArrayList<>();
        int firstIndex = 0;
        // todo 这边没看懂
        while (firstIndex < S.length()) {
            int lastIndex = firstIndex;
            for (int i = firstIndex; i < S.length() && i <= lastIndex; i++) {
                int index = lastIndexsOfChar[char2Index(S.charAt(i))];
                if (index > lastIndex) {
                    lastIndex = index;
                }
            }
            partitions.add(lastIndex - firstIndex + 1);
            firstIndex = lastIndex + 1;
        }
        return partitions;
    }

    private static int char2Index(char c) {
        return c - 'a';
    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(JSON.toJSONString(partitionLabels(s)));
    }
}
