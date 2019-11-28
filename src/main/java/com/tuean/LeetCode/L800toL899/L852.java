package com.tuean.LeetCode.L800toL899;

public class L852 {

    public int peakIndexInMountainArray(int[] A) {
        if (A == null || A.length < 3) return -1;
        int mid = 1, length = A.length;
        while (mid + 1 < length) {
            if (A[mid - 1] < A[mid] && A[mid] > A[mid + 1]) return mid;
            mid ++;
        }
        return -1;
    }


}
