package com.tuean.LeetCode.L1toL99;

import java.util.Arrays;

public class L16 {



    // 找数组中三数之和与target差值最小的一个

    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) return 0;
        Arrays.sort(nums);
        // biggest
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    end--;
                } else {
                    start++;
                }

                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }


    // 从答案里面看到的 思路一样的 速度更快

    public int threeSumClosest2(int[] num, int target) {
        if (num==null||num.length==0){
            return -1;
        }
        int result=0;
        int minDif=Integer.MAX_VALUE;
        Arrays.sort(num);

        for (int i=0; i<num.length-2; i++){
            int first=num[i];
            int left=i+1;
            int right=num.length-1;

            while (left<right){
                int value=first+num[left]+num[right];
                if (value==target){
                    return value;
                }
                int diff=Math.abs(value-target);
                if (diff<minDif){
                    result=value;
                    minDif=diff;
                }

                if (value>target){
                    do {right--;} while(left<right && num[right]==num[right+1]);
                }
                else if (value<target){
                    do {left++;} while (left<right && num[left]==num[left-1]);
                }

            }
        }
        return result;
    }

}
