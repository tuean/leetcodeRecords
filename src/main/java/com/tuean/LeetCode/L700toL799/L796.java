package com.tuean.LeetCode.L700toL799;

import java.util.List;

public class L796 {

    // 判断字符串是不是可以通过移位得到

    public static boolean rotateString(String A, String B) {
        if (A.length() == 0 && B.length() == 0) return true;

        String tmp = null;
        int i = 0;
        int t = 0;
        for (int x = 0; x < A.length(); x++) {
            if (i >= B.length()) return false;
            if (A.charAt(x) != B.charAt(i)) {
                if (tmp != null) {
                    return false;
                }
                t++;
            } else {
                tmp = A.substring(0, t);
                i++;
            }
        }

        B = B.substring(i, B.length());
        return B.equals(tmp);
    }


    // 脑子二了

    // 之前做过这种类型的

    public static boolean rotateString2(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }

    public static void main(String[] args) {
        rotateString("vcuszhlbtpmksjleuchmjffufrwpiddgyynfujnqblngzoogzg", "fufrwpiddgyynfujnqblngzoogzgvcuszhlbtpmksjleuchmjf");
    }
}

