package com.tuean.LeetCode.L600toL699;

public class L674 {

    // 这题很简单

    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0) return 0;
        int length=1,temp=1;
        for(int i=0; i<nums.length-1;i++) {
            if(nums[i]<nums[i+1]) {
                temp++;
                length=Math.max(length,temp);
            } else {
                temp=1;
            }
        }
        return length;
    }
}
