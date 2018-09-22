package com.tuean.LeetCode.L500toL599;

public class L504 {


    // 把数字转为7进制的字符串

    public String convertToBase7(int num) {
        return Integer.toString(num, 7);

//        if (num < 0)
//            return '-' + convertTo7(-num);
//        if (num < 7)
//            return num + "";
//        return convertTo7(num / 7) + num % 7;
    }

}
