package com.tuean.LeetCode.L100toL199;

import java.util.HashSet;
import java.util.Set;

public class L167 {


    public int[] twoSum(int[] numbers, int target) {
//        Set<Integer> set = new HashSet<>();
//        int[] result = new int[2];
//        for (int i : numbers) {
//            set.add(i);
//        }
//        for (int i : set) {
//            if (i + i == target) continue;
//            if (set.contains(target - i)) {
//                result[0] = Math.min(i, target - i);
//                result[1] = Math.max(i, target - i);
//            }
//        }
//        Boolean a = true, b = true;
//        for (int x = 0; x < numbers.length; x++) {
//            if (numbers[x] == result[0] && a) {
//                result[0] = x + 1;
//                a = false;
//            }
//            if (numbers[x] == result[1] && b && result[0] != numbers[x]) {
//                result[1] = x + 1;
//                b = false;
//            }
//        }
//        return result;
//
//        上面这个方法太捞了 不行 直接两边逼近多好

        int l = 0, r = numbers.length - 1;
        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[]{l + 1, r + 1};
    }
}
