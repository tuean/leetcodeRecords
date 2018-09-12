package com.tuean.LeetCode.L1toL99;

public class L27 {

//    和26一样 只是删除指定的值

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int result = 0;
        int index = 0;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] != val) {
                nums[index] = nums[x];
                index++;
                result ++;
            } else {
                nums[x] = 0;
            }
        }
        return result;
    }
}
