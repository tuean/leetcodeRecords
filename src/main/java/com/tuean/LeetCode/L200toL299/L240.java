package com.tuean.LeetCode.L200toL299;

/**
 * equal to L74
 */
public class L240 {


//    public static boolean searchMatrix(int[][] matrix, int target) {
//        if (matrix == null || matrix.length < 1  || matrix[0].length < 1) return false;
//        int height = matrix.length - 1;
//        int width = matrix[0].length - 1;
//
//        int start_width = 0, start_heigth = 0, end_width = width, end_height = height;
//        while (start_width <= end_width && start_heigth <= end_height) {
//            int mid_width = start_width + (end_width - start_width) / 2;
//            int mid_height = start_heigth + (end_height - start_heigth) / 2;
//            if (matrix[mid_height][mid_width] == target) return true;
//            boolean flag = false;
//            if (matrix[mid_height][mid_width] < target) {
//                if (mid_width + 1 <= width && mid_height + 1 <= height) {
//                    int right = matrix[mid_height][mid_width + 1];
//                    int bottom = matrix[mid_height + 1][mid_width];
//                    if (right >= bottom) {
//                        start_heigth = mid_height + 1;
//                    } else {
//                        start_width = mid_width + 1;
//                    }
//                    flag = true;
//                } else if (mid_width + 1 <= width) {
//                    start_width = mid_width + 1;
//                    flag = true;
//                } else if (mid_height + 1 <= height) {
//                    start_heigth = mid_height + 1;
//                    flag = true;
//                }
//            }
//            if (matrix[mid_height][mid_width] > target ) {
//                if (mid_width - 1 >= 0 && mid_height - 1 >= 0) {
//                    int left = matrix[mid_height][mid_width - 1];
//                    int top = matrix[mid_height - 1][mid_width];
//                    if (left >= top) {
//                        end_height = mid_height - 1;
//                    } else {
//                        end_width = mid_width - 1;
//                    }
//                    flag = true;
//                } else if (mid_width - 1 >= 0) {
//                    end_width = mid_width - 1;
//                    flag = true;
//                } else if (mid_height - 1 >= 0) {
//                    end_height = mid_height - 1;
//                    flag = true;
//                }
//            }
//            if (!flag) return false;
//        }
//
//        return false;
//    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else if(target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
//        int[][] matrix = new int[][]{{-1, 3}};

//        matrix = new int[][]{{-5}};
//        matrix = new int[][]{{1, 4}, {2, 5}};
        matrix = new int[][]{{1, 1}};

//        System.out.println(searchMatrix(matrix, 5));
//        System.out.println(searchMatrix(matrix, 20));
//        System.out.println(searchMatrix(matrix, 3));
        System.out.println(searchMatrix(matrix, 2));
    }

}
