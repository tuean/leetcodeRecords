package com.tuean.LeetCode;

public class L88 {

//    Input:
//    nums1 = [1,2,3,0,0,0], m = 3
//    nums2 = [2,5,6],       n = 3
//
//    Output: [1,2,2,3,5,6]

//    这题也很没意思 从后往前排序就好了

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int n1 = m - 1;
        int n2 = n - 1;
        while (index >= 0) {
            if (n1 >= 0 && n2 >= 0) {
                if (nums1[n1] > nums2[n2]) {
                    nums1[index] = nums1[n1];
                    n1--;
                } else {
                    nums1[index] = nums2[n2];
                    n2--;
                }
            } else if (n1 >= 0 && n2 < 0) {
                nums1[index] = nums1[n1];
                n1--;
            } else if (n1 < 0 && n2 >= 0) {
                nums1[index] = nums2[n2];
                n2--;
            }

            index--;
        }
    }
}
