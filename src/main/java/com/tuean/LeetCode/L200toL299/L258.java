package com.tuean.LeetCode.L200toL299;

public class L258 {

//    Input: 38
//    Output: 2
//    Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
//    Since 2 has only one digit, return it.


    public static int addDigits(int num) {
        if(num<10)
            return num;
        else if(num%9 ==0)
            return 9;
        else
            return num%9;
    }


    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
