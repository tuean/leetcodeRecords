package com.tuean.LeetCode.L300toL399;

import java.util.*;

public class L380 {

    static class RandomizedSet {
        Map<Integer, Integer> map;
        List<Integer> list;
        Random rand;

        /** Initialize your data structure here. */
        public RandomizedSet() {
            map = new HashMap();
            list = new ArrayList();
            rand = new Random();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if (map.containsKey(val)) return false;

            map.put(val, list.size());
            list.add(list.size(), val);
            return true;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if (! map.containsKey(val)) return false;

            // move the last element to the place idx of the element to delete
            int lastElement = list.get(list.size() - 1);
            int idx = map.get(val);
            list.set(idx, lastElement);
            map.put(lastElement, idx);
            // delete the last element
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            return list.get(rand.nextInt(list.size()));
        }
    }

    public static void main(String[] args) {
        // 初始化一个空的集合。
        RandomizedSet randomSet = new RandomizedSet();

        // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        System.out.println(randomSet.insert(1));

        // 返回 false ，表示集合中不存在 2 。
        System.out.println(randomSet.remove(2));

        // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        System.out.println(randomSet.insert(2));

        // getRandom 应随机返回 1 或 2 。
        System.out.println(randomSet.getRandom());

        // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
        System.out.println(randomSet.remove(1));

        // 2 已在集合中，所以返回 false 。
        System.out.println(randomSet.insert(2));

        // 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
        System.out.println(randomSet.getRandom());
    }



}
