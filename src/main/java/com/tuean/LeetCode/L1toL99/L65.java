package com.tuean.LeetCode.L1toL99;

public class L65 {

    public int[] plusOne(int[] digits) {
        if (digits == null) return new int[0];

        boolean addFlag = false;
        int length = digits.length;
        for (int x = length - 1; x >= 0; x--) {
            if (x == length - 1 || addFlag) {
                int old = digits[x];
                int newVal = old + 1;
                if (newVal == 10) {
                    addFlag = true;
                    newVal = 0;
                } else {
                    addFlag = false;
                }
                digits[x] = newVal;
            }
        }
        if (addFlag) {
            int[] newDigits = new int[length + 1];
            newDigits[0] = 1;
            for (int x = 0; digits.length > x; x++) {
                newDigits[x + 1] = digits[x];
            }
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        L65 l65 = new L65();
//        System.out.println(l65.plusOne(new int[]{0}));
        System.out.println(l65.plusOne(new int[]{9}));

    }

}
