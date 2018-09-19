package com.tuean.LeetCode.L400toL499;

public class L405 {

    // integer to hex
    // 二进制转16进制

    // 用 stringbuffer 可以提高性能

    static char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

    public static String toHex(int num) {
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = map[num & 15] + result;
            num = num >>> 4;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(toHex(-1));
    }

}
