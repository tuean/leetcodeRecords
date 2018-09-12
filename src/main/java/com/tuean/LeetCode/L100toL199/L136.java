package com.tuean.LeetCode.L100toL199;

public class L136 {

//    在很多一对的数字 除了一个单个的
//    不使用额外的空间

//    看到有个老哥用了异或来做 老哥稳的啊


    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int x = 0; x < nums.length; x++) {
            result ^= nums[x];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,1,2}));
    }
}
