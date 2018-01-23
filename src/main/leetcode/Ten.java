package com.tuean.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhongxiaotian on 2017/12/31.
 */
public class Ten {
//    isMatch("aa","a") → false
//    isMatch("aa","aa") → true
//    isMatch("aaa","aa") → false
//    isMatch("aa", "a*") → true
//    isMatch("aa", ".*") → true
//    isMatch("ab", ".*") → true
//    isMatch("aab", "c*a*b") → true
    public boolean isMatch(String s, String p) {
        if(s == null || "".equals(s.trim())){
            return false;
        }
        List<String> pList = Arrays.stream(p.split("")).collect(Collectors.toList());
        List<String> sList = Arrays.stream(s.trim().split("")).collect(Collectors.toList());


        return true;
    }



}
