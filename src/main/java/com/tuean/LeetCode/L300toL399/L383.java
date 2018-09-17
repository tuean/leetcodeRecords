package com.tuean.LeetCode.L300toL399;

public class L383 {

    // 勒索信 ransom note  判断字符是不是够用就可以了
    // 直接抄了人家的解题过程 思路很简单

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
