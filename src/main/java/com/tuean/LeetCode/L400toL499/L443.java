package com.tuean.LeetCode.L400toL499;

public class L443 {

    // 压缩字符

    public static int compress(char[] chars) {
        if (chars == null || chars.length == 0) return 0;
        char last = chars[0];
        int repeat = 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int x = 1; x < chars.length; x++) {
            if (chars[x] == last) {
                repeat++;
            } else {
                stringBuffer.append(last);
                if (repeat > 1) stringBuffer.append(repeat);
                last = chars[x];
                repeat = 1;
            }
        }

        stringBuffer.append(last);
        if (repeat > 1) stringBuffer.append(repeat);

        char[] cs = new char[stringBuffer.length()];
        int i = 0;
        while (i < chars.length) {
            if (i < stringBuffer.length()) {
                chars[i] = stringBuffer.charAt(i);
            } else {
                chars[i] = '\0';
            }
            i++;
        }

        return stringBuffer.length();
    }


    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','a','b','b','c','c','c'}));
    }

}
