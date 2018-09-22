package com.tuean.LeetCode.L500toL599;

public class L557 {



    public String reverseWords(String s) {

        // 这个写法有问题  多个空格会被替换为1个  前后的空格也会被去掉
        if (s == null || s.length() == 0) return s;

        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");

        for (String word : arr) {
            StringBuilder temp = new StringBuilder(word);
            sb.append(temp.reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}
