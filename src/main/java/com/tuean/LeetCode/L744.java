package com.tuean.LeetCode;



public class L744 {

    public static char nextGreatestLetter(char[] letters, char target) {

        int standard = target - '0';
        int min = standard;
        // choose the biggest one
        char result = letters[letters.length - 1];

        for(char letter : letters){
            int value = letter - '0';
            if(value > standard){
                int a = value - standard;
                int tmp = min > a ? a : min;
                if(tmp != min){
                    min = tmp;
                    result = (char)(value + '0');
                }
            } else if(value != standard && value + 26 > standard){
                int a = value - standard + 26;
                int tmp = min > a ? a : min;
                if(tmp != min){
                    min = tmp;
                    result = (char)(value + '0');
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'd'));
    }
}
