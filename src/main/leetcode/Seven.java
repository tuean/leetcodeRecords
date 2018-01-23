package com.tuean.leetcode;

/**
 * Created by zhongxiaotian on 2017/11/18.
 */
public class Seven {

    public static int reverse(int x) {
        boolean negative = x < 0 ? true : false;
        String[] xs = String.valueOf(Math.abs(x)).split("");
        boolean zeroStart = true;
        StringBuffer sb = new StringBuffer();
        for(int a = xs.length - 1; a > -1; a--){
            if(zeroStart && "0".equals(xs[a])){
                continue;
            }else{
                zeroStart = false;
                sb.append(xs[a]);
            }
        }
        if("".equals(sb.toString())){
            return x;
        }
        try{
            int value = Integer.valueOf(sb.toString());
            return negative ? -1 * value : value;
        }catch (Exception e){

        }

        return 0;
    }

//    public static void main(String[] args) {
//        System.out.println(reverse());
//    }

}
