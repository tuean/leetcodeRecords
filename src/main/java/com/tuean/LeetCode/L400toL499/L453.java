package com.tuean.LeetCode.L400toL499;

public class L453 {


//    移动最小的步数使所有值相等
//    每次移动 都会使N - 1 个数 + 1
//    sum 总数 minNum 最小的数  m 移动步数 n 给定的长度 x 最终的结果
//    sum + m * (n - 1) = x * n
//    x = minNum + m
//    sum - minNum * n = m

    public int minMoves(int[] nums) {
      if (nums == null || nums.length == 0) {
        return 0;
      }

      int total = 0;
      int minNum = nums[0];
      for (int n : nums) {
          minNum = Math.min(minNum, n);
          total +=n;
      }
      return total - minNum * nums.length;
    }


}
