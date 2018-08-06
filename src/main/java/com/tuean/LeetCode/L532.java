package com.tuean.LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class L532 {

    public static int findPairs(int[] nums, int k) {
        if(nums == null || nums.length < 1 || k < 0){
            return 0;
        }

        Set<String> set = new HashSet<>();
        Set<Integer> source = Arrays.stream(nums).boxed().collect(Collectors.toSet());


        if(k == 0){
            Map<Integer, Integer> map = new HashMap<>(nums.length);
            for(int x : nums){
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            int result = 0;
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry entry = (Map.Entry) iterator.next();
                if((Integer) entry.getValue() > 1){
                    result++;
                }
            }
            return result;
        }else{

            Iterator<Integer> iterator = source.iterator();
            while(iterator.hasNext()){
                Integer x = iterator.next();
                if(source.contains(x - k)){
                    set.add(x - k > x ? (x + (x-k) + "") : ((x-k) + x + ""));
                }
                if(source.contains(x + k)){
                    set.add(x + (x + k) + "");
                }
            }
        }



        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{3,1,4,1,5}, 0));
    }

}
