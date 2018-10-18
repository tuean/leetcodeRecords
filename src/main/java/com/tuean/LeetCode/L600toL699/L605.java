package com.tuean.LeetCode.L600toL699;

/**
 * Created by zhongxiaotian on 2018/6/25.
 */
public class L605 {

    // 数学规则 看有几个连续的0
    // 例如 000 就表示可以种一个 00000 可以种两个

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int zero = 1;
        int result = 0;
        for (int x = 0; x < flowerbed.length; x++) {
            if (flowerbed[x] == 0) {
                zero++;
            } else {
                result += (zero - 1) / 2;
                zero = 1;
            }
        }
        // 要考虑结尾是 0 的情况 这个我自己写的时候没有考虑到
        if(zero != 0) result += zero / 2;
        return result >= n;
    }

    public static void main(String[] args) {
        canPlaceFlowers(new int[]{1,0,0,0,1,0,0}, 2);
    }
}
