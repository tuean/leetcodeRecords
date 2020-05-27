package com.tuean.LeetCode.L100toL199;


import com.alibaba.fastjson.JSON;

public class L189 {


//    Input: [1,2,3,4,5,6,7] and k = 3
//    Output: [5,6,7,1,2,3,4]
//    Explanation:
//    rotate 1 steps to the right: [7,1,2,3,4,5,6]
//    rotate 2 steps to the right: [6,7,1,2,3,4,5]
//    rotate 3 steps to the right: [5,6,7,1,2,3,4]
//    重新排序

    public static void rotate(int[] nums, int k) {
        while (k >= nums.length) k -= nums.length;
        if (k <= 0) return;

        k = nums.length - k;
        int[] tmp = new int[k];
        for (int i = 0; i < k; i++) {
            tmp[i] = nums[i];
        }

        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - k) {
                nums[i] = nums[i + k];
            } else {
                nums[i] = tmp[x];
                x++;
            }
        }
        System.out.println(JSON.toJSONString(nums));
    }

    public static void main(String[] args) {
        rotate(new int[]{1,2}, 1);
    }


}
