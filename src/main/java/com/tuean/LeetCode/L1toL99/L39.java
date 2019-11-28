package com.tuean.LeetCode.L1toL99;

import java.util.LinkedList;
import java.util.List;

public class L39 {

    // 从数组中找到所有和为target的可能

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();
        action(candidates, target, result, temp);
        return result;
    }

    public void action(int[] candidates, int target, List<List<Integer>> result, List<Integer> temp) {
        Integer sum = temp.stream().mapToInt(Integer::intValue).sum();

    }

}
