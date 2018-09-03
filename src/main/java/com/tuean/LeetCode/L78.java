package com.tuean.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class L78 {

//    分割成排列的列表

//    这个方法理解错了
//    public static List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        result.add(new ArrayList<>());
//
//        int gap = 1;
//        while (gap <= nums.length) {
//            int start = 0;
//            int end = start + gap;
//            while (end <= nums.length) {
//                List<Integer> list = new ArrayList<>();
//                for (int x = start; x < end; x++) {
//                    list.add(nums[x]);
//                }
//                result.add(list);
//                start += 1;
//                end += 1;
//            }
//            gap += 1;
//        }
//        return result;
//    }

//    https://leetcode.com/problems/subsets/discuss/27281/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)
//    这种题目有套路的 就按下面的方式

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    public static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for (int x = start; x < nums.length; x++) {
            tempList.add(nums[x]);
            backtrack(list, tempList, nums, x + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> list = subsets(new int[]{1,2,3});
        System.out.println(list);
    }
}
