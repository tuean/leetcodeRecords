package com.tuean.LeetCode.L1toL99;

/**
 * Created by zhongxiaotian on 2018/7/26.
 */
public class L10 {


//    '.' = single character
//    '*' = match zero or more of the preceding element
//             s    p
//    isMatch("aa","a") return false
//    isMatch("aa","aa") return true
//    isMatch("aaa","aa") return false
//    isMatch("aa", "a*") return true
//    isMatch("aa", ".*") return true
//    isMatch("ab", ".*") return true
//    isMatch("aab", "c*a*b") return true

    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));
        System.out.println(isMatch("aa", "aa"));
        System.out.println(isMatch("aaa", "a"));
        System.out.println(isMatch("aa", "a*"));
        System.out.println(isMatch("aa", ".*"));
        System.out.println(isMatch("ab", ".*"));
        System.out.println(isMatch("aab", "c*a*b"));

    }

//    public static boolean isMatch(String s, String p) {
//
//        // base case
//        if (p.length() == 0) {
//            return s.length() == 0;
//        }
//
//        // special case
//        if (p.length() == 1) {
//
//            // if the length of s is 0, return false
//            if (s.length() < 1) {
//                return false;
//            }
//
//            //if the first does not match, return false
//            else if ((p.charAt(0) != s.charAt(0)) && (p.charAt(0) != '.')) {
//                return false;
//            }
//
//            // otherwise, compare the rest of the string of s and p.
//            else {
//                return isMatch(s.substring(1), p.substring(1));
//            }
//        }
//
//        // case 1: when the second char of p is not '*'
//        if (p.charAt(1) != '*') {
//            if (s.length() < 1) {
//                return false;
//            }
//            if ((p.charAt(0) != s.charAt(0)) && (p.charAt(0) != '.')) {
//                return false;
//            } else {
//                return isMatch(s.substring(1), p.substring(1));
//            }
//        }
//
//        // case 2: when the second char of p is '*', complex case.
//        else {
//            //case 2.1: a char & '*' can stand for 0 element
//            if (isMatch(s, p.substring(2))) {
//                return true;
//            }
//
//            //case 2.2: a char & '*' can stand for 1 or more preceding element,
//            //so try every sub string
//            int i = 0;
//            while (i<s.length() && (s.charAt(i)==p.charAt(0) || p.charAt(0)=='.')){
//                if (isMatch(s.substring(i + 1), p.substring(2))) {
//                    return true;
//                }
//                i++;
//            }
//            return false;
//        }
//
//    }

    public static boolean isMatch(String sStr, String pStr) {
        char[] s = sStr.toCharArray();
        char[] p = pStr.toCharArray();
        Boolean[][] memo = new Boolean[s.length+1][p.length+1];

        return isMatch(s, 0, p, 0, memo);
    }

    private static boolean isMatch(char[] s, int sIdx, char[] p, int pIdx, Boolean[][] memo) {
        if (sIdx == s.length && pIdx == p.length) {
            return true;
        }
        if (pIdx == p.length) {
            return false;
        }

        if (memo[sIdx][pIdx] != null) {
            return memo[sIdx][pIdx];
        }

        boolean result = false;

        if (pIdx < p.length - 1 && p[pIdx+1] == '*') {
            for (int i = sIdx; i <= s.length && (i == sIdx || s[i-1] == p[pIdx] || p[pIdx] == '.'); i++)
            {
                result = isMatch(s, i, p, pIdx + 2, memo);
                if (result)
                {
                    break;
                }
            }
        }
        else if (sIdx < s.length && (s[sIdx] == p[pIdx] || p[pIdx] == '.')) {
            result = isMatch(s, sIdx + 1, p, pIdx + 1, memo);
        }

        memo[sIdx][pIdx] = result;
        return result;
    }
}
