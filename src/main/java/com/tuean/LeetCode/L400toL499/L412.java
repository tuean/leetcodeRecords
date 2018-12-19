package com.tuean.LeetCode.L400toL499;

import java.util.LinkedList;
import java.util.List;

public class L412 {

    // 这题太蠢了 就是问3 和 5的倍数


    public List<String> fizzBuzz(int n) {
        List<String> res = new LinkedList<String>();
        int cnt3 = 3;
        int cnt5 = 5;
        for(int i=1;i<=n;i++){
            if(i == cnt3 && i == cnt5){
                res.add("FizzBuzz");
                cnt3 += 3;
                cnt5 += 5;
            }else if(i == cnt3){
                cnt3 += 3;
                res.add("Fizz");
            }else if(i == cnt5){
                cnt5 += 5;
                res.add("Buzz");
            }else{
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}
