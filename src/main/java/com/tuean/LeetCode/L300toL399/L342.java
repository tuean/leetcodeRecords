package com.tuean.LeetCode.L300toL399;

public class L342 {

    // 判断是不是 3 的n次方

    // 不用循环做

    // 和 L326 一个套路题 但是解题不一样

    public boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1)) == 0 && (num - 1) % 3 == 0;
//        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
        //0x55555555 is to get rid of those power of 2 but not power of 4
        //so that the single 1 bit always appears at the odd position
        // 0x55555555 = 0101 0101 0101 0101 0101 0101 0101 0101
        // 帅啊

    }

}
