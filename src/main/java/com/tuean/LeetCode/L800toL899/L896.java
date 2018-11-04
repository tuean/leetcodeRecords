package com.tuean.LeetCode.L800toL899;

public class L896 {



    public static boolean isMonotonic(int[] A) {
//        if (A.length < 2) return true;
//
//        int last = A[0];
//        boolean r = A[1] - A[0] > 0;
//        for (int x = 1; x < A.length; x++) {
//            if (A[x] - last > 0 ^ r) {
//                return false;
//            }
//            last = A[x];
//        }
//        return true;

        // 上面的方式写起来比较难受 下面的看起来更直观

        boolean inc = true, dec = true;
        for (int x = 1; x < A.length; x++) {
            inc &= A[x - 1] <= A[x];
            dec &= A[x - 1] >= A[x];
        }
        return inc || dec;

    }


    public static void main(String[] args) {
//        System.out.println(false ^ false);
        isMonotonic(new int[]{6,5,4,4});
    }

}
