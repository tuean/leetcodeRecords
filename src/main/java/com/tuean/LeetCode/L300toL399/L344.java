package com.tuean.LeetCode.L300toL399;

public class L344 {


    // 翻转字符串

    public String reverseString(String s) {
//        StringBuffer sb = new StringBuffer();
//        int x = s.length() - 1;
//        while (x >= 0) {
//            sb.append(s.charAt(x));
//            x--;
//        }
//        return sb.toString();
        return new StringBuffer(s).reverse().toString();
    }
}
