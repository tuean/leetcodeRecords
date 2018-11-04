package com.tuean.LeetCode.L800toL899;

import java.util.HashSet;

public class L804 {


    // 简单的对应值转换


    public int uniqueMorseRepresentations(String[] words) {
        if(words.length == 0) return 0;
        if(words.length == 1) return 1;

        String[] morseWords = new String[words.length];
        String[] morseCharString = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();

        for(String word : words) {

            StringBuilder sb = new StringBuilder();
            for(char ch : word.toCharArray()) {
                sb.append(morseCharString[ch-97]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

}
