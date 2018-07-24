package com.tuean.LeetCode;

/**
 * Created by zhongxiaotian on 2018/7/18.
 */
public class L273 {

    // max = 2^31-1 = 2,147,483,648 = Integer.Max_Value

    // 速度太慢 需要优化
    public static String numberToWords(int num) {
        String result = "";
        if(num == 0){
            return "Zero";
        }

        int billion = num/(1000*1000*1000);
        if(billion > 0){
            result += convertToEnglish(billion) + " billion ";
        }
        num -= billion * 1000*1000*1000;

        int million = num / (1000*1000);
        if(million > 0){
            result += convertToEnglish(million) + " million ";
        }
        num -= million * 1000*1000;

        int thousand = num / 1000;
        if(thousand > 0){
            result += convertToEnglish(thousand) + " thousand ";
        }

        num -= thousand * 1000;
        int rest = num;
        if(rest > 0){
            result += convertToEnglish(num);
        }

        while(result.endsWith(" ")){
            result = result.substring(0, result.length() - 1);
        }

        result = result.replaceAll("\\s+", " ");

        return result;
    }

    private static String convertToEnglish(int n){



        String result = "";
        String[] ten = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] hundred = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] twenty = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        if(n == 0){
            return ten[0];
        }

        int houdred = n / 100;
        if(houdred > 0){
            result += ten[houdred] + " Hundred ";
        }
        n -= houdred * 100;

        int tens = n / 10;
        int unit = n - tens * 10;
        if(n > 9 && n < 20){
            result += twenty[unit];
        } else{
            // 十位是0的情况 直接读个位
            if(n < 10){
                result += ten[unit];
            }else{
                result += hundred[tens] + " " + ten[unit];
            }
        }



        return result;
    }


    public static void main(String[] args) {
//        Long num = (2L << 30) - 1;
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(num);
//        System.out.println(num/(1000*1000*1000));
        System.out.println(numberToWords(50865));
//        System.out.println(convertToEnglish(202));
    }


}
