package com.tuean.LeetCode.L400toL499;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L438 {


    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
        int[] hash = new int[256];
        for (char c : p.toCharArray()) {
            hash[c]++;
        }

        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            //move right everytime, if the character exists in p's hash, decrease the count
            //current hash value >= 1 means the character is existing in p
            if (hash[s.charAt(right++)]-- >= 1) count--;

            //when the count is down to 0, means we found the right anagram
            //then add window's left to result list
            if (count == 0) list.add(left);

            //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new match window
            //++ to reset the hash because we kicked out the left
            //only increase the count if the character is in p
            //the count >= 0 indicate it was original in the hash, cuz it won't go below 0
            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
        }
        return list;


//        char[] ptrn = p.toCharArray();
//        char[] str = s.toCharArray();
//
//        int[] w = new int[26];
//
//        for(char c : ptrn) w[c - 'a']++;
//
//        int start = 0;
//
//        List<Integer> result = new LinkedList<>();
//
//        for(int i = 0; i<str.length; i++){
//            int cIndex = str[i] - 'a';
//
//            w[cIndex]--;
//            // the crucial bit, if we have seen the character too many times
//            // or it is a character that is not in the pattern, rewind the starting index
//            while(w[cIndex] < 0){
//                w[str[start] - 'a']++;
//                start++;
//            }
//
//            if(i - start + 1 == ptrn.length){
//                result.add(start);
//                w[str[start] - 'a']++;
//                start++;
//            }
//        }
//
//
//        return result;
    }
}
