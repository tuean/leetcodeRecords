package com.tuean.LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class L179 {

    // 排序 用到了 String.compareTo() 方法

    public String largestNumber(int[] nums) {
        if(nums == null){
            return "";
        }

        String[] array = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);

        Arrays.sort(array, (String s1, String s2) -> (s2 + s1).compareTo(s1 + s2));

        return Arrays.stream(array).reduce((x, y) -> x.equals("0") ? y : x + y).get();

    }

}
