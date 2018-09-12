package com.tuean.LeetCode.L100toL199;

public class L190 {

//    Input: 43261596
//    Output: 964176192
//    Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
//            return 964176192 represented in binary as 00111001011110000010100101000000.

    // you need treat n as an unsigned value

    // todo 没看懂
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                result <<= 1;
        }
        return result;
    }


    public static String toFullBinaryString(int num) { //将整数num转化为32位的二进制
        char[] chs = new char[Integer.SIZE];
        for (int i = 0; i < Integer.SIZE; i++)
        {
            chs[Integer.SIZE - 1 - i] = (char) (((num >> i) & 1) + '0');
            System.out.println(chs[Integer.SIZE - 1 - i]);
        }
        return new String(chs);
    }

    public static void main(String[] args) {
        System.out.println(toFullBinaryString(43261596));
    }


}
