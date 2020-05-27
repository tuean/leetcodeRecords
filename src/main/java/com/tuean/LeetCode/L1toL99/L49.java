package com.tuean.LeetCode.L1toL99;

import java.util.*;

public class L49 {
//    同字母 异顺序  anagrams
//    Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
//    Output:
//            [
//            ["ate","eat","tea"],
//            ["nat","tan"],
//            ["bat"]
//            ]
//  一遍过 perfert

    private static final String source = "abcdefghijklmnopqrstuvwxyz";
    private static final int length = source.length();

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String resort = resort(str);
            List<String> list = map.getOrDefault(resort, new LinkedList<>());
            list.add(str);
            map.put(resort, list);
        }
        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }

    private static String resort(String word) {
        if (word == null || word.length() < 1) return word;
        StringBuffer sb = new StringBuffer();
        for (int x = 0; length > x; x++) {
            int index = 0;
            while (true) {
                int r = word.indexOf(source.charAt(x), index);
                if (r < 0) break;
                sb.append(source.charAt(x));
                index = r + 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(resort("easdatt"));
    }

}
