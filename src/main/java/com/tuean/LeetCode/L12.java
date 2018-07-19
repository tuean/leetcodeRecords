package com.tuean.LeetCode;

/**
 * Created by zhongxiaotian on 2018/7/10.
 */
public class L12 {

    // integer to roman
    // 直接贪心算法 最大值开始算起 到0为止
    // 题目只要求1-3999 所以M最大就没问题了


    public static String intToRoman(int num) {
        String str = "";
        String symbol[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int    value[]  = {1000,900,500,400, 100, 90,  50, 40,  10, 9,   5,  4,   1};
        for(int i=0;num!=0;++i) {
            while(num>=value[i]) {
                num = num - value[i];
                str = str + symbol[i];
            }
        }
        return str;

    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }

}
