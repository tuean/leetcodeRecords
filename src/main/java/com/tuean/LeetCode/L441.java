package com.tuean.LeetCode;

public class L441 {

//    时间不通过
//    public static int arrangeCoins(int n) {
//        if(n < 0){
//            return 0;
//        }
//        int sum = 0;
//        int next = 0;
//        int index = 0;
//        while(true){
//            sum += index;
//            next = sum + index + 1;
//            if(n >= sum && next > n){
//                return index;
//            }
//            index++;
//        }
//    }


    // todo 数学规则

    public static int arrangeCoins(int n){
        return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
    }


    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
}
