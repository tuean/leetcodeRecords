package com.tuean.Algorithm.String;

public class Manacher {

    // TODO: 2018/11/11 manacher 算法 求 字符串的最长回文子串
//    http://www.cnblogs.com/egust/p/4580299.html


    public static String manacher(String s) {

        // 构造新的字符串 @#x#x#@
        String t = "$#";
        for (int i = 0; i < s.length(); ++i) {
            t += s.charAt(i);
            t += "#";
        }
        t += "@";



        int[] p = new int[t.length()];;
        int mx = 0, id = 0, resLen = 0, resCenter = 0;
        for (int i = 1; i < t.length()-1; ++i) {
            p[i] = mx > i ? java.lang.Math.min(p[2 * id - i], mx - i) : 1;
            while ( ((i - p[i])>=0) && ((i + p[i])<t.length()-1) && (t.charAt(i + p[i]) == t.charAt(i - p[i])))
                ++p[i];
            if (mx < i + p[i]) {
                mx = i + p[i];
                id = i;
            }
            if (resLen < p[i]) {
                resLen = p[i];
                resCenter = i;
            }
        }
        return s.substring((resCenter - resLen) / 2, (resCenter - resLen) / 2 + resLen-1);

    }
}
