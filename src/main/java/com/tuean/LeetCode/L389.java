package com.tuean.LeetCode;

public class L389 {

    public static char findTheDifference(String s, String t) {

        int result = 0;

        for(int x = 0; x < t.length(); x ++){
            result += t.charAt(x);
        }

        for(int x = 0; x < s.length(); x++){
            result -= s.charAt(x);
        }

        return (char) result;
    }


    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }

}
