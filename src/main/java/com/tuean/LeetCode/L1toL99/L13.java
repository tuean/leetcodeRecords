package com.tuean.LeetCode.L1toL99;

/**
 * Created by zhongxiaotian on 2018/7/10.
 */
public class L13 {

    // roman to integer
    // 规则：把所有数值加起来
    // 但是如果左边的值比右边的小，那就是右边的值减左边的值，即全部加起来后减去两份左边的值

    public int romanToInt(String s) {
        char[] sc = s.toCharArray();
        int ans = toInt(sc[0]);
        for (int i = 1; i < s.length(); i++) {
            ans += toInt(sc[i]);
            if (toInt(sc[i - 1]) < toInt(sc[i])) {
                ans -= toInt(sc[i - 1]) * 2;
            }
        }
        return ans;
    }

    int toInt(char s) {
        switch(s) {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default: return 0;
        }
    }

}
