package com.tuean.Algorithm;

public class RadixSort {


    public static int[] sort(int[] nums) {
        // find the max value in the nums
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            max = java.lang.Math.max(n, max);
        }

        //
        int exp = 1; // 1, 10, 100...
        int R = 10; // 10 digits

        int[] aux = new int[nums.length];
        while (max / exp > 0) {
            int[] count = new int[R];

            for (int i = 0; i < nums.length; i++) {
                count[(nums[i] / exp) % 10]++;
            }

            for (int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }

            for (int i = nums.length - 1; i >= 0; i--) {
                aux[--count[(nums[i] / exp) % 10]] = nums[i];
            }

            for (int i = 0; i < nums.length; i++) {
                nums[i] = aux[i];
            }
            exp *= 10;
        }
        return aux;
    }


    public static void main(String[] args) {
        sort(new int[]{3, 1, 6, 0});
    }

}
