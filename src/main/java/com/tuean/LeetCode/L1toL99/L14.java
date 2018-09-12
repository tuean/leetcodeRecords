package com.tuean.LeetCode.L1toL99;

public class L14 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null ) return "";
        if (strs.length == 1) return strs[0];
        StringBuffer sb = new StringBuffer();
        try {
            int i = 0;
            while (true) {
                char tmp = strs[0].charAt(i);
                for (int x = 1; x < strs.length; x++) {
                    if (strs[x].charAt(i) != tmp) {
                        return sb.length() == 0 ? "" : sb.toString();
                    }
                    if (x == strs.length - 1) sb.append(tmp);
                }
                i++;
            }
        } catch (Exception var) {
            ;
        }
        return sb.length() == 0 ? "" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
