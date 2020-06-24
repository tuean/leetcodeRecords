package com.tuean.LeetCode.L900toL999;

import java.util.HashMap;
import java.util.Map;

/**
 * 和可被K整除的子数组
 */
public class L974 {

    // 计算同余法
    // 用sum保存前n个数之和
    // 计算每个sum的余数，保存
    // 余数相同则可以整除 ， 如
    // A = [4,5,0,-2,-3,1], K = 5
    // p[0] = 4, p[1] = 9, p[2] = 9, p[3] = 7, p[4] = 4, p[5] = 5
    // 余数对应 4,4,4,2,4,0;
    // 余数4有4个，排列组合法，计算4*3/2 = 6
    // 0余数相当于整除，用排列组合法(初始0赋值1)， 2*1/2 = 1;
    // 最终答案为7
    public int subarraysDivByK(int[] A, int K) {
        Map<Integer,Integer> map = new HashMap();
        // 保存单个数，求余为0的情况
        map.put(0,1);
        int sum = 0;
        for(int num : A){
            sum += num;
            int m = (sum % K + K) % K;
            map.put(m,map.getOrDefault(m,0) + 1);
        }
        int count = 0;
        for(int num : map.keySet()){
            // 排列组合，从同余里取2个数，除去有序情况
            count += map.get(num) * (map.get(num)-1) / 2;
        }
        return count;
    }

}
