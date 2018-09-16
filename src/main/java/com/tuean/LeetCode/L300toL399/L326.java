package com.tuean.LeetCode.L300toL399;

public class L326 {

    // 判断是不是 3 的n次方

    // 不用循环做

    // 帅啊

    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return ( n>0 &&  1162261467%n==0);
    }
}
