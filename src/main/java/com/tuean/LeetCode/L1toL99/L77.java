package com.tuean.LeetCode.L1toL99;

import java.util.ArrayList;
import java.util.List;

public class L77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k <= 0) return result;
        if (n <= 0) return result;
        if (n < k) return result;

        cal(n, k, 1, new ArrayList<>(), result);

        return result;
    }

    public void cal(int n, int k, int begin, List<Integer> list, List<List<Integer>> result) {
        if (list.size() == k) {
//            List<Integer> list1 = List.copyOf(list);
//            result.add(list1);
            return;
        }

        for (int x = begin; x <= n; x++) {
            list.add(x);
            cal(n, k, x + 1, list, result);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        L77 l77 = new L77();
        List<List<Integer>> result = l77.combine(4, 2);
        System.out.println(result);
    }

}
