package com.tuean.LeetCode.L100toL199;

public class L171 {

//    和 L168相对

    public static int titleToNumber(String s) {
        if (s == null) return 0;
        int result = 0;
        for (int x = 0; x < s.length(); x++) {
//            result += 26 * (s.charAt(x) - 'A' + 1);
            result = result * 26 + (s.charAt(x) - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AA"));
    }
}
