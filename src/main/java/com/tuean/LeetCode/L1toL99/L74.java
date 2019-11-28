package com.tuean.LeetCode.L1toL99;

public class L74 {


    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1  || matrix[0].length < 1) return false;
        int height = matrix.length;
        int width = matrix[0].length;

        int start = 0, end = height - 1;

        while (start <= end) {
            if (start == end) {
                int[] source = matrix[start];
                int left = 0, rigth = width - 1;
                while (left <= rigth) {
                    int index = left + (rigth - left) / 2;
                    if (source[index] == target) return true;
                    if (source[index] < target) left = index + 1;
                    if (source[index] > target) rigth = index - 1;
                }
                return false;
            } else {
                int mid = start + (end - start) / 2;
                if (matrix[mid][0] < target && matrix[mid][width - 1] < target) {
                    start = mid + 1;
                }
                if (matrix[mid][width - 1] > target && matrix[mid][0] > target) {
                    end = mid - 1;
                }
                if (matrix[mid][0] <= target && matrix[mid][width - 1] >= target) {
                    start = end = mid;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int[][] matrix = new int[][]{{1}};
        System.out.println(searchMatrix(matrix, 1));
    }

}
