package com.tuean.LeetCode.L400toL499;

public class L476 {


    public static int findComplement(int num) {
        // 这是第一时间的想法
//        Double i = Double.valueOf("0");
//        int j = 0;
//
//        while (i < num) {
//            i += Math.pow(2, j);
//            j++;
//        }
//
//        return i.intValue() - num;

        // 从数字的角度去看
        // 更帅
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        num = ~num;
        return num & mask;

//        ==
//        return (Integer.highestOneBit(num) << 1) - 1 - num;
    }

    public static void main(String[] args) {
        findComplement(5);
    }
}
