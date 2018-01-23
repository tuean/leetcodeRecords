package com.tuean.leetcode;

/**
 * Created by zhongxiaotian on 2017/10/15.
 */
public class Four {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if ((n1 + n2) % 2 == 1) {
            return findNumK(nums1, n1, nums2, n2, (n1 + n2) / 2 + 1);
        } else {
            return (findNumK(nums1, n1, nums2, n2, (n1 + n2) / 2) + findNumK(nums1, n1, nums2, n2, (n1 + n2) / 2 + 1)) / 2;
        }
    }

    /**
     * @param nums1
     * @param n1
     * @param nums2
     * @param n2
     * @param k  k为需要求的数
     * @return
     */
    public double findNumK(int[] nums1, int n1, int[] nums2, int n2, int k) {
        //保证第一个数组较小
        if (n1 > n2) {
            return findNumK(nums2, n2, nums1, n1, k);
        }
        if (n1 == 0) {
            return nums2[k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[0], nums2[0]);
        }
        int temp1 = Math.min(k / 2, n1);
        int temp2 = k - temp1;
        if (nums1[temp1 - 1] < nums2[temp2 - 1]) {
            return findNumK(subArray(nums1, temp1), n1 - temp1, nums2, n2, k - temp1);
        } else if (nums1[temp1 - 1] > nums2[temp2 - 1]) {
            return findNumK(nums1, n1, subArray(nums2, temp2), n2 - temp2, k - temp2);
        } else {
            return nums1[temp1 - 1];
        }
    }

    public int[] subArray(int[] a, int b) {
        int[] temp = new int[a.length - b];
        for (int i = 0; i < a.length - b; i++) {
            temp[i] = a[b + i];
        }
        return temp;
    }
}
