package com.tuean.LeetCode.L200toL299;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L229 {

    // 找出出现超过 nums.length / 3 次数的数
    // 摩尔投票

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>(2);
        if (nums == null || nums.length == 0) {
            return list;
        }

        int size = nums.length / 3;
        int candidateA = nums[0];
        int candidateB = nums[0];
        int countA = 0, countB = 0;
        for (int n : nums) {
            if (candidateA == n) {
                countA++;
                continue;
            }
            if (candidateB == n) {
                countB++;
                continue;
            }
            // A B都不投 票数为0的情况下变更候选人
            if (countA == 0) {
                candidateA = n;
                countA = 1;
                continue;
            }
            if (countB == 0) {
                candidateB = n;
                countB = 1;
                continue;
            }

            // 候选人票数都大于一 当前投票没有投 A or B
            countA--;
            countB--;
        }

        countA=0; countB=0;
        for (int n : nums) {
            if (n == candidateA) countA++;
            if (n == candidateB) countB++;
        }
        if (countA > size) list.add(candidateA);
        if (countB > size) list.add(candidateB);
        return list;
    }


    public static void main(String[] args) {
        majorityElement(new int[]{1,2,1,1,1,3,3,4,3,3,3,4,4,4});
    }
}
