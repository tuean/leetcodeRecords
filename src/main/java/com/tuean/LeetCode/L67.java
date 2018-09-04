package com.tuean.LeetCode;

public class L67 {

//    二进制的两个数相加

//    不要用if判断 写法太二了

    public static String addBinary(String a, String b) {

        int left = a.length() - 1;
        int right = b.length() - 1;
        StringBuffer sb = new StringBuffer();
        int carry = 0;
        while (left >= 0 || right >= 0) {
            int sum = carry;
            if (left >= 0) sum += Character.getNumericValue(a.charAt(left--));
            if (right >= 0) sum += Character.getNumericValue(b.charAt(right--));
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
