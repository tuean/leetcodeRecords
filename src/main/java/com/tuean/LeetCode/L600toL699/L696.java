package com.tuean.LeetCode.L600toL699;

public class L696 {


//    Input: "00110011"
//    Output: 6
//    Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
//
//    Notice that some of these substrings repeat and are counted the number of times they occur.
//
//    Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
    // 解法一开始没想到 被题目答案误导了
    // 看到答案 每次计算连续的0 or 1的个数 然后和之前的个数比较 可重复的数就是两者之中较小的那个


    public static int countBinarySubstrings(String s) {
        int cur = 1, pre = 0, res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) cur++;
            else {
                res += Math.min(cur, pre);
                pre = cur;
                cur = 1;
            }
        }
        return res + Math.min(cur, pre);
    }

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }
}
