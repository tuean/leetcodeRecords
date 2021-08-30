package com.tuean.random;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }

    public static String reverseStr(String s, Integer k) {
        if (s == null || k < 0) return s;
        char[] cs = s.toCharArray();
        int length = cs.length, index = 0;
        while (true) {
            int start = k * index, end = k * (index + 1);
            if (start > length) break;
            if (end > length) {
                reverseStr(cs, start, end - 2);
            } else {
                reverseStr(cs, start, end - 1);
            }
            index = index + 2;
        }
        return new String(cs);
    }


    /**
     * 翻转指定位置（start - end）字符
     *
     * @param cs
     * @param start
     * @param end
     */
    public static void reverseStr(char[] cs, Integer start, Integer end) {
        int gap = end - start;
        for (int x = 0; gap > x; x++) {
            swap(cs, start, end - x);
        }
    }



    /**
     * 交换指定位置的两个字符
     *
     * @param cs
     * @param left
     * @param right
     */
    public static void swap(char[] cs, int left, int right) {
        char t = cs[left];
        cs[left] = cs[right];
        cs[right] = t;
    }




}
