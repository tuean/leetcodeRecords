package com.tuean.LeetCode;

public class L705 {

    int size = 16;
    String[] keys = null;
    String[] values = null;
    public L705() {
        keys = new String[size];
        values = new String[size];
    }

    public void add(int key) {
        if (keys == null) {
            keys = new String[size];
            values = new String[size];
        }
        if (keys[size - 1] != null) {
            String[] keysTmp = new String[size * 2];
            String[] valuesTmp = new String[size * 2];
            int i = 0;
            for (int x = 0; x < keys.length; x++) {
                if (keys[x] != null) {
                    keysTmp[i] = keys[x];
                    valuesTmp[i] = values[x];
                    i++;
                }
            }
            keys = keysTmp;
            values = valuesTmp;
        }
        for (int x = 0; x < keys.length; x++) {
            if (keys[x] == null) {
                keys[x] = String.valueOf(key);
                break;
            }
        }
    }

    public void remove(int key) {
        if (keys == null || values == null) {
            return;
        }
        for (int x = 0; x < keys.length; x++) {
            if (keys[x] != null && String.valueOf(key).equals(keys[x])) {
                keys[x] = null;
                return;
            }
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        boolean contains = false;
        if (keys == null || values == null) {
            return contains;
        }
        for (int x = 0; x < keys.length; x++) {
            if (keys[x] != null && String.valueOf(key).equals(keys[x])) {
                keys[x] = null;
                contains = true;
                break;
            }
        }
        return contains;
    }


    public static void main(String[] args) {
        L705 obj = new L705();
        obj.add(1);
        obj.remove(2);
        boolean param_3 = obj.contains(2);
        System.out.println(param_3);
    }
}
