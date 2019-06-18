package com.tuean.LeetCode.L600toL699;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class L677 {

    /** Initialize your data structure here. */
    private Map<String, Integer> map;
    public L677() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        if (key == null) return;
        if (map.containsKey(key)) {
            map.remove(key);
        }
        map.put(key, val);
    }

    public int sum(String prefix) {
        if (prefix == null) return 0;
        Iterator i = map.entrySet().iterator();
        Integer result = 0;
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            if (entry.getKey().toString().startsWith(prefix)) {
                result += (Integer) entry.getValue();
            }
        }
        return result;
    }


    /**
     * Your MapSum object will be instantiated and called as such:
     * MapSum obj = new MapSum();
     * obj.insert(key,val);
     * int param_2 = obj.sum(prefix);
     */

}
