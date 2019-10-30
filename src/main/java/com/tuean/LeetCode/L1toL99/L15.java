package com.tuean.LeetCode.L1toL99;

import java.util.*;

public class L15 {

    public static List<List<Integer>> threeSum(int[] num) {

//        List<List<Integer>> result = new ArrayList<>();
//
//        // 分成正数 负数两个list
//        List<Integer> nl = new ArrayList<>();
//        List<Integer> pl = new ArrayList<>();
//        boolean zero = false;
//        for (int n : nums) {
//            if (n == 0) {
//                zero = true;
//            } else if (n > 0) {
//                pl.add(n);
//            } else {
//                nl.add(n);
//            }
//        }
//
//        if (zero) {
//            for (int x : nl) {
//                if (pl.contains(-x)) {
//                    List<Integer> tmp = new ArrayList<>();
//                    tmp.add(x);
//                    tmp.add(-x);
//                    tmp.add(0);
//                    result.add(tmp);
//                }
//            }
//        }
//
//        int i = 0,j = 0;
//        while (i < nl.size()) {
//            j = i + 1;
//            while (j < nl.size()) {
//                if (pl.contains(0 - nl.get(i) - nl.get(j))) {
//                    List<Integer> tmp = new ArrayList<>();
//                    tmp.add(nl.get(i));
//                    tmp.add(nl.get(j));
//                    tmp.add(0 - nl.get(i) - nl.get(j));
//                    result.add(tmp);
//                }
//                j++;
//            }
//            i++;
//        }
//
//        return result;



        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length - 2; i++) {
            if (i == 0 || (num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

}
