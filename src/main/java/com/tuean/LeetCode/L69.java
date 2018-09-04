package com.tuean.LeetCode;

public class L69 {

//    把一个数开根号 输出小数点前的数

//    顺序搜索 太捞了 速度太慢
//    int i = 1;
//        while (true) {
//        if (i * i == x) break;
//        if (i * i < x) i++;
//        if (i * i > x) {
//            i--;
//            break;
//        }
//    }
//        return i;

//    用二分查找

    public static int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        int left = 0, right = x, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2; // 防止数字过大
            if (mid == 0) break;
            if(mid <= x / mid) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(1));
    }
}
