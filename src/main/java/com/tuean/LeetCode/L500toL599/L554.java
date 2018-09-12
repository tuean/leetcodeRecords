package com.tuean.LeetCode.L500toL599;

import java.util.*;

public class L554 {

    /**
     * write by myself
     *
     * @param wall
     * @return
     */
    public static int leastBricks(List<List<Integer>> wall) {
        if(wall == null){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(List<Integer> w : wall){
            int num = 0;
            // 最后一位不加 因为加上后长度固定为wall的长度 无意义
            for(int x = 0; x < w.size() - 1; x++){
                num += w.get(x);
                map.put(num, map.get(num) == null ? 1 : (map.get(num) + 1));
            }
        }

        Iterator iterator = map.entrySet().iterator();
        int max = 0;
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            max = max < (Integer) entry.getValue() ? (Integer) entry.getValue() : max;
        }

        return wall.size() - max;
    }

    /**
     * copy from internet
     *
     * @param wall
     * @return
     */
    public static int leastBricksExample(List<List<Integer>> wall) {
        Map<Integer, Integer> widths = new HashMap<Integer, Integer>();
        int minNum = wall.size();
        for(List<Integer> rows : wall){
            int sum = 0;
            for(int i = 0; i < rows.size() - 1; i ++){
                sum += rows.get(i);
                int num = widths.getOrDefault(sum,0);
                widths.put(sum,++num);
                minNum = Math.min(minNum, wall.size() - num);
            }
        }

        return minNum;
    }


    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(Arrays.asList(new Integer[]{1,2,2,1}));
        list.add(Arrays.asList(new Integer[]{3,1,2}));
        list.add(Arrays.asList(new Integer[]{1,3,2}));
        list.add(Arrays.asList(new Integer[]{2,4}));
        list.add(Arrays.asList(new Integer[]{3,1,2}));
        list.add(Arrays.asList(new Integer[]{1,3,1,1}));
        System.out.println(leastBricks(list));

    }
}
