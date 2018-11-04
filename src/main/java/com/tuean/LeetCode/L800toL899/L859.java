package com.tuean.LeetCode.L800toL899;

import java.util.*;
import java.util.stream.Collectors;

public class L859 {


    // 想的复杂了 还以为两个字符串是不同长度的


    public boolean buddyStrings(String A, String B) {
        if (A == null || B == null || A.length() != B.length()) return false;

        if (A.equals(B)) {
            Set<Character> set = new HashSet<>();
            for (Character s : A.toCharArray()) {
                set.add(s);
            }
            return set.size() < A.length();
        } else {
            List<Integer> list = new ArrayList<>();
            for (int x = 0; x < A.length(); x++) {
                if (A.charAt(x) != B.charAt(x)) {
                    list.add(x);
                }
                if (list.size() > 2) return false;
            }
            return list.size() == 2 && A.charAt(list.get(0)) == B.charAt(list.get(1)) && A.charAt(list.get(1)) == B.charAt(list.get(0));
        }
    }

}
