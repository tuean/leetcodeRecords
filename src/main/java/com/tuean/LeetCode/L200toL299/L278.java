package com.tuean.LeetCode.L200toL299;

public class L278 {

    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private static boolean isBadVersion(int n) {
        return true;
    }
}
