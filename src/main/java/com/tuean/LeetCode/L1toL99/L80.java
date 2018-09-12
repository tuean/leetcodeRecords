package com.tuean.LeetCode.L1toL99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L80 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        boolean duplicate = false;
        int tmp = nums[0];
        int result = 1;
        List<Integer> list = new ArrayList<>();
        for (int x = 1; x < nums.length; x++) {
            if (tmp == nums[x] && !duplicate) {
                duplicate = true;
            } else if (tmp == nums[x] && duplicate) {
                list.add(x);
                continue;
            } else {
                duplicate = false;
            }
            tmp = nums[x];
            result++;
        }
//        int[] resultArray = new int[nums.length - list.size()];
        int i = 0;
        for (int x = 0; x < nums.length; x++) {
            if (!list.contains(x)) {
                nums[i] = nums[x];
                i++;
            }
            if (x >= nums.length - list.size()) {
                nums[x] = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1,1,1,2,2,3};
        removeDuplicates(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }


//    更简单的一个方法
    public int removeDuplicates_Shorter(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i-2]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}
