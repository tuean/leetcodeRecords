package com.tuean.LeetCode.L500toL599;


public class L517 {

    public static int findMinMoves(int[] machines) {
        int sum = 0;
        int total = machines.length;
        for (int x : machines){
            sum+=x;
        }
        if (total == 0 || sum % total != 0) {
            return -1;
        }
        int avr = sum / total;


        // 下面的来自discussion
        // https://leetcode.com/problems/super-washing-machines/discuss/99185/Super-Short-and-Easy-Java-O(n)-Solution

        // 从结果倒推 [avr, .. , avr] -> [machines]
        // 示例如下：[0, 0, 11, 5]
        // 1: [-4, -4. 7, 1]
        // 2: [0, -8, 7, 1]
        // 3: [0, 0, -1, 1]
        // 4: [0, 0, 0, 0]
        // 其中最大的值是 8 结果就是8

        int cnt = 0, max = 0;
        for (int load : machines) {
            cnt = cnt + load - avr;
            max = Math.max(Math.max(max, Math.abs(cnt)), load - avr);
        }


        return max;
    }


    public static void main(String[] args) {
        System.out.println(findMinMoves(new int[]{1, 0, 5}));
    }
}
