package com.tuean.LeetCode.L900toL999;

public class L905 {


    // 偶数放在前面 奇数放在后面
    // 第一反应就是首尾指针

    public int[] sortArrayByParity(int[] A) {
        int left = 0, right = A.length - 1;

        while (left < right) {
            if (A[left] % 2 == 1 && A[right] % 2 == 0) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
                left++;
                right--;
            } else if (A[left] % 2 == 1 && A[right] % 2 == 1) {
                right--;
            } else {
                left++;
            }
        }

        return A;
    }

}
