package com.tuean.LeetCode.L600toL699;

public class L678 {

//    “(**())”
//      判断是否是关闭的 * 可以使 （） 或 空

//    用 * 做分支判断 如果最后的结果为0  那么就是闭合的

//    https://leetcode.com/problems/valid-parenthesis-string/discuss/107577/Short-Java-O(n)-time-O(1)-space-one-pass

    public static boolean checkValidString(String s) {
        int low = 0, high = 0;
        for (int x = 0; x < s.length(); x++) {
            if ('(' == s.charAt(x)) {
                low ++;
                high ++;
            } else if (')' == s.charAt(x)) {
                if (low > 0) low --;
                high --;
            } else { // *
                if (low > 0) low --;
                high ++;
            }
            if (high < 0) return false;
        }

        return low == 0;
    }


//    还有一种解法
//    先从左边开始 * 认为是 （
//    再从右边开始 * 认为是 ）
//    只要结果不是小与0  即 两者相加的最大值比另一个值还小，那么我们就可以认为肯定存在某一个数量的* 可以使得（）抵消

    public static boolean checkValidString1(String s) {
        if (s == null || s.length() == 0) return true;
        int match = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '*') {
                match++;
            }
            if (s.charAt(i) == ')') {
                match--;
            }
            if (match < 0) {
                return false;
            }
        }
        if (match == 0) return true;
        // reset
        match = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')' || s.charAt(i) == '*') {
                match++;
            }
            if (s.charAt(i) == '(') {
                match--;
            }
            if (match < 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(checkValidString("(**())"));
    }

}
