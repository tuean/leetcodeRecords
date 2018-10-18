package com.tuean.LeetCode.L600toL699;

public class L645 {


    // 用map 还是很简单的 换个思路 用异或 XOR 还不是很熟练

//    The idea is based on: (1 ^ 2 ^ 3 ^ .. ^ n) ^ (1 ^ 2 ^ 3 ^ .. ^ n) = 0

//    Suppose we change 'a' to 'b', then all but 'a' and 'b' are XORed exactly 2 times.

//    The result is then  0 ^ a ^ b ^ b ^ b = a ^ b

//    Let c = a ^ b, if we can find 'b' which appears 2 times in the original array, 'a' can be easily calculated by a = c ^ b.

    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];
        int[] ans = {0,0};
        for(int i = 0; i < n; i++) {
            ans[1] ^= (i+1) ^ nums[i];
            if (++count[nums[i]-1] == 2)
                ans[0] = nums[i];
        }
        ans[1] ^= ans[0];
        return ans;
    }
}
