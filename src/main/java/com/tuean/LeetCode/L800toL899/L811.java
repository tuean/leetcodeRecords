package com.tuean.LeetCode.L800toL899;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class L811 {

    public static List<String> subdomainVisits(String[] cpdomains) {
        if (cpdomains == null || cpdomains.length == 0) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        final String dot = "\\.";

        Map<String, Integer> map = new HashMap<>();
        for (String cp : cpdomains) {
            String[] cps = cp.split(" ");
            Integer num = Integer.valueOf(cps[0]);
            String[] domains = cps[1].split(dot);

            // domain.baidu.com
            // 0      1     2
            int a = 0;
            while (a < domains.length) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int x = a; x < domains.length; x++) {
                    if (x != a) {
                        stringBuffer.append(".");
                    }
                    stringBuffer.append(domains[x]);
                }
                a++;
                String key = stringBuffer.toString();
                map.put(key, map.getOrDefault(key, 0) + num);
            }
        }

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            result.add(entry.getValue() + " " + entry.getKey());
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(JSON.toJSONString(subdomainVisits(new String[]{"9001 discuss.leetcode.com"})));
    }
}
