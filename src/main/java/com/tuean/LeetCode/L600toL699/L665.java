package com.tuean.LeetCode.L600toL699;

public class L665 {

    public boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length <= 1) return true;
        boolean found = false;
        for (int i = 1; i< nums.length; i++){
            if(nums[i]<nums[i-1]){
                if(found) {
                    return false;
                } else {
                    if(i-2>=0 && nums[i]<nums[i-2]) {
                        nums[i] = nums[i-1];
                    }
                    found = true;
                }
            }
        }
        return true;
    }
}
