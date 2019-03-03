package com.tuean.LeetCode.L1toL99;

import java.util.*;

/**
 * <h1>Permutations II</h1>
 *
 */
public class L47 {


    public static List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null || nums.length < 1) {
            return new ArrayList<>(0);
        }

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        dfs(nums, used, new ArrayList<>(), result);
        return result;
    }

    private static void dfs(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> result) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; nums.length > i; i++) {
            if (used[i]) continue;
            if(i>0 && nums[i-1]==nums[i] && !used[i-1]) continue;
            used[i] = true;
            list.add(nums[i]);
            dfs(nums, used, list, result);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        permuteUnique(new int[]{1,1,2});
    }
}
