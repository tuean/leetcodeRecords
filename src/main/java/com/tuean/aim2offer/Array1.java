package com.tuean.aim2offer;

public class Array1 {

    // 找出数组中的重复数字
    // 长度为n的数组中所有数字都在 0~n-1的范围内。
    // 数组中某些数字重复，但是不知道几个数字重复，也不知道重复了几次
    // 找出数组中任意重复的数字

    // 1.排序后+遍历
    // 2.hash
    // 3.如果按顺序 第n位上的数字应该等于n

    public static int findDuplicate(int[] array) {
        if (array == null || array.length < 1) return -1;
        int length = array.length;
        for (int i = 0; length > i; i++) {
            if (array[i] < 0 || array[i] > length - 1);
        }
        for (int i = 0; length > i; i++) {
            while(array[i] != i) {
                if (array[i] == i) return i;
                int t = array[i];
                array[i] = array[t];
                array[t] = t;
            }
        }
        return -1;
    }

}
