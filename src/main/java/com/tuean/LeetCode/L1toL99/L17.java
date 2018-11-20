package com.tuean.LeetCode.L1toL99;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L17 {


    // BFS FIFO


    public static List<String> letterCombinationsBFS(String digits) {
        String[] source = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> result = new LinkedList<>();

        for (int x = 0; x < digits.length(); x++) {
            String s = source[Character.getNumericValue(digits.charAt(x))];
            if (s.length() == 0) continue;
            while (result.isEmpty() || result.peek().length() == x) {
                String old = result.isEmpty() ? "" : result.remove();
                for (char c : s.toCharArray()) {
                    result.add(old + c);
                }
            }
        }

        return result;
    }


    public List<String> letterCombinationsDFS(String digits) {
        List<String> result = new ArrayList<String>();
        if(digits == null || digits.length() == 0) return result;
        String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        dfs(digits, result, new StringBuilder(), map, 0);
        return result;
    }

    private void dfs(String digits, List<String> result, StringBuilder sb, String[] map, int i) {
        if(i == digits.length()) {
            result.add(sb.toString());
            return;
        }
        int index = digits.charAt(i) - '0';
        for(int j = 0; j < map[index].length(); j++) {
            sb.append(map[index].charAt(j));
            dfs(digits, result, sb, map, i + 1);
            sb.setLength(sb.length() - 1);
        }
    }


    public static void main(String[] args) {
        letterCombinationsBFS("23");
    }
}
