package com.tuean.LeetCode;

public class L58 {

//    这道题没啥意思 以后可以不用做

    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().length() == 0) return 0;
        String[] ss = s.split(" ");

        return ss[ss.length - 1].length();
    }
}
