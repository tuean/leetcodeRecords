package com.tuean.LeetCode.L1toL99;

import java.util.*;

public class L18 {

    // 4sum 应该是基于3sum和2sum来做的

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        // 分解成two sum来做
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) return new ArrayList<>();
        Arrays.sort(nums);
        Map<Integer, List<List<Integer>>> map = new HashMap<>();

        for (int x = 0; x < nums.length - 2; x++) {
            for (int y = x + 1; y < nums.length - 1; x++) {
                int tmp = nums[x] + nums[y];
                List<Integer> list = new ArrayList<>();
                list.add(x);
                list.add(y);
                List<List<Integer>> oldValue = map.getOrDefault(tmp, new ArrayList<>());
                oldValue.add(list);
                map.put(tmp, oldValue);
            }
        }

        Iterator<Map.Entry<Integer, List<List<Integer>>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, List<List<Integer>>> entry = iterator.next();
            result.addAll(unite(twoSum(nums, target - entry.getKey()), entry.getValue()));
        }

        return result;
    }

    public static List<List<Integer>> unite(List<List<Integer>> matched, List<List<Integer>> entryValue) {
        if (matched == null || matched.size() == 0) return new ArrayList<>(0);
        List<List<Integer>> result = new ArrayList<>();

        for (int x = 0; x < matched.size(); x++) {
            for (int y = 0; y < entryValue.size(); y++) {
                if (matched.get(x).get(0) != entryValue.get(y).get(0) && matched.get(x).get(1) != entryValue.get(y).get(1)
                        && matched.get(x).get(0) != entryValue.get(y).get(1) && matched.get(x).get(1) != entryValue.get(y).get(0)) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.addAll(matched.get(x));
                    tmp.addAll(entryValue.get(y));
                    result.add(tmp);
                }
            }
        }

        return result;
    }


    /**
     * 返回和为target的两个数在numbers中的坐标列表
     *
     * @param numbers
     * @param target
     * @return
     */
    public static List<List<Integer>> twoSum(int[] numbers, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                List<Integer> list = new ArrayList<>();
                list.add(l);
                list.add(r);
                result.add(list);
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        fourSum(new int[]{1,0,-1,0,-2,2}, 0);
    }

}
