package com.tuean.LeetCode.L1toL99;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L6 {

    // 找规律 重新排序即可

    public static String convert(String s, int numRows) {
        Map<Integer, String> map = new HashMap<>();
        if (s == null || s.length() < 2) return s;
        int length = s.length();
        int gap = numRows + numRows - 2;
        if (gap <= 0) return s;
        for (int x = 0; length > x; x++) {
            int index = x % gap;
            if (index >= numRows) {
                index = gap - index;
            }
            map.put(index, map.getOrDefault(index, "") + s.charAt(x));
        }

        StringBuilder sb = new StringBuilder();
        int x = 0;
        while(map.get(x) != null) {
            sb.append(map.get(x));
            x++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        String result = convert("PAYPALISHIRING", 3);
//        System.out.println("PAHNAPLSIIGYIR".equals(result));
        convert("AB", 1);
    }

}
