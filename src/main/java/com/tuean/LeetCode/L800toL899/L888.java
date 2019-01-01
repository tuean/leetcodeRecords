package com.tuean.LeetCode.L800toL899;

import java.util.HashSet;
import java.util.stream.IntStream;

public class L888 {

    // 思路一样的 就是算差值 然后sumA-差-r[0]+r[1] 是不是等于sumB-差-r[1]+r[0] 相等就返回

    public int[] fairCandySwap(int[] A, int[] B) {
        int dif = (IntStream.of(A).sum() - IntStream.of(B).sum()) / 2;
        HashSet<Integer> S = new HashSet<>();
        for (int a : A) S.add(a);
        for (int b : B) if (S.contains(b + dif)) return new int[] {b + dif, b};
        return new int[0];
    }

}
