package com.tuean.LeetCode.L400toL499;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * question from
 * https://leetcode.com/problems/assign-cookies/description/
 *
 * resolved by
 * https://github.com/CyC2018/Interview-Notebook/blob/master/notes/Leetcode%20%E9%A2%98%E8%A7%A3.md
 *
 *
 * Created by zhongxiaotian on 2018/6/25.
 */
public class L455 {

//    Input: [1,2], [1,2,3]
//    Output: 2
//
//    Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
//    You have 3 cookies and their sizes are big enough to gratify all of the children,
//    You need to output 2.

    public static int findContentChildren(int[] children, int[] cookies){
        if(children == null || children.length == 0 || cookies == null || cookies.length == 0){
            return 0;
        }
        Arrays.sort(children);
        Arrays.sort(cookies);
        int ch = 0, co = 0;
        int chs = children.length;
        int cos = cookies.length;
        while(ch < chs && co < cos){
            if(children[ch] <= cookies[co]){
                ch++;
            }
            co++;
        }
        return ch;
    }

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2}, new int[]{1,2,3}));
    }

}
