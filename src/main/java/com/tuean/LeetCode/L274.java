package com.tuean.LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class L274 {

//    维基百科
//    可以按照如下方法确定某人的H指数：
//
//    将其发表的所有SCI论文按被引次数从高到低排序；
//    从前往后查找排序后的列表，直到某篇论文的序号大于该论文被引次数。所得序号减一即为H指数。

    public static int hIndex(int[] citations) {

        if(citations == null || citations.length == 0){
            return 0;
        }
        List<Integer> list = Arrays.stream(citations).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        list.add(0, 0);
        int result = 0;
        for(int x = 0; x < list.size(); x++){
            if(list.get(x) >= x && list.get(x) != 0){
                result = x;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{3,0,6,1,5}));
        System.out.println(hIndex(new int[]{1}));
        System.out.println(hIndex(new int[]{}));
        System.out.println(hIndex(new int[]{0}));
    }
}
