package com.tuean.LeetCode;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class L118 {

    public static List<List<Integer>> generate(int numRows) {
        if(numRows < 1){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> initList = new ArrayList<>();
        initList.add(1);
        result.add(initList);
        if(numRows == 1){
            return result;
        }

        List<Integer> param = initList;
        for(int x = 0; x < numRows - 1; x++){
            param = nextList(param);
            result.add(param);
        }
        return result;
    }

    private static List<Integer> nextList(List<Integer> last){
        List<Integer> r = new ArrayList<>(last.size() + 2);
        r.add(1);
        for(int x = 0; x < last.size() - 1; x++){
            r.add(last.get(x) + last.get(x + 1));
        }
        r.add(1);
        return r;
    }


    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(generate(5)));
    }

}
