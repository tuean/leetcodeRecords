package com.tuean.LeetCode;

/**
 * Created by zhongxiaotian on 2018/1/24.
 */
public class L8 {
    public static int myAtoi(String str) {
        if(str == null || "".equals(str)){
            return 0;
        }
        int sign = 0;
        int start = -1;
        int end = -1;
        boolean positive = true;
        int a = 0;
        str = str.trim();
        for(int x = 0; str.length() > x; x++){
            if(str.charAt(x) == '+' ){
                sign ++;
            }else if(str.charAt(x) == '-'){
                sign ++;
                positive = false;
            }else if(str.charAt(x) >= '0' && str.charAt(x) <= '9'){
                if(start == -1){
                    start = x;
                }
                if(x > end){
                    end = x;
                }
            }else{
                a ++;
                if(a > 0){
                    break;
                }
            }
            if(sign > 1){
                break;
            }else{
                continue;
            }
        }

        if(start == end && start == -1 ){
            if(str.charAt(0) - '0' > -1 && str.charAt(0) - '0' < 10){
                return str.charAt(0) - '0';
            }
            return 0;
        }

        Integer result = 0;
        for(int x = start; end >= x; x++){
            try{
                int tmp = str.charAt(x) - '0';
                result = result * 10 + tmp;
            }catch (Exception var){
                return Integer.MAX_VALUE;
            }
        }

        if(!positive){
            result = result * (-1);
        }

        return result;
    }


    public static void main(String[] args) {
//        System.out.print(myAtoi("+"));
//        System.out.print(myAtoi("+1"));
//        System.out.print(myAtoi("1"));
//        System.out.print(myAtoi("-1"));
//        System.out.print(myAtoi("123"));
//        System.out.print(myAtoi("  -0012a42"));
        System.out.println(myAtoi("   +0 123"));
    }


    public int atoi(String str) {
        if (str == null || str.length() < 1){
            return 0;
        }

        // trim white spaces
        str = str.trim();

        char flag = '+';

        // check negative or positive
        int i = 0;
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        // use double to store result
        double result = 0;

        // calculate value
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }

        if (flag == '-'){
            result = -result;
        }

        // handle max and min
        if (result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        if (result < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }
}


