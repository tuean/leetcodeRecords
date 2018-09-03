package com.tuean.LeetCode;

public class L844 {


    public static boolean backspaceCompare(String S, String T) {
        if (S == null || T == null) return false;
        return getString(S).equals(getString(T));
    }

    private static String getString(String source){
        StringBuffer sb = new StringBuffer();
        for (int x = 0; x < source.length(); x++) {
            if (source.charAt(x) == "#".charAt(0)) {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(source.charAt(x));
            }
        }

        return sb.toString();
    }

//    https://leetcode.com/problems/backspace-string-compare/discuss/135603/C++JavaPython-O(N)-time-and-O(1)-space
    public boolean backspaceCompare1(String S, String T) {
        for (int i = S.length() - 1, j = T.length() - 1;; i--, j--) {
            for (int b = 0; i >= 0 && (b > 0 || S.charAt(i) == '#'); --i) {
                b += S.charAt(i) == '#' ? 1 : -1;
            }
            for (int b = 0; j >= 0 && (b > 0 || T.charAt(j) == '#'); --j) {
                b += T.charAt(j) == '#' ? 1 : -1;
            }
            if (i < 0 || j < 0 || S.charAt(i) != T.charAt(j)) {
                return i == -1 && j == -1;
            }
        }
    }



    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab##", "c#d#"));
    }
}
