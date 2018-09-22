package com.tuean.LeetCode.L400toL499;

import java.util.ArrayList;
import java.util.List;

public class L448 {

//    给一个 1-n 的数组 找出里面没有出现的数
//    Input:
//            [4,3,2,7,8,2,3,1]
//
//    Output:
//            [5,6]

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) nums[val] = -nums[val];
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) ret.add(i+1);
        }

        return ret;
    }
}
