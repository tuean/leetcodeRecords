package com.tuean.LeetCode;

public class L705 {

//    int size = 2^10;
//    String[] keys = null;
//    public L705() {
//        keys = new String[size];
//    }
//
//    public void add(int key) {
//        if (keys == null) {
//            keys = new String[size];
//        }
//        if (keys[size - 1] != null) {
//            String[] keysTmp = new String[keys.length + size];
//            int i = 0;
//            for (int x = 0; x < keys.length; x++) {
//                if (keys[x] != null) {
//                    keysTmp[i] = keys[x];
//                    i++;
//                }
//            }
//            keys = keysTmp;
//        }
//        for (int x = 0; x < keys.length; x++) {
//            if (keys[x] == null) {
//                keys[x] = String.valueOf(key);
//                break;
//            }
//        }
//    }
//
//    public void remove(int key) {
//        if (keys == null) {
//            return;
//        }
//        for (int x = 0; x < keys.length; x++) {
//            if (keys[x] != null && String.valueOf(key).equals(keys[x])) {
//                keys[x] = null;
//                continue;
//            }
//        }
//    }
//
//    /** Returns true if this set contains the specified element */
//    public boolean contains(int key) {
//        boolean contains = false;
//        if (keys == null) {
//            return contains;
//        }
//        for (int x = 0; x < keys.length; x++) {
//            if (keys[x] != null && String.valueOf(key).equals(keys[x])) {
//                contains = true;
//                break;
//            }
//        }
//        return contains;
//    }

//   上面这样写性能太差了


//    private int buckets = 1000;
//    private int itemsPerBucket = 1001;
//    private boolean[][] table;
//
//    /** Initialize your data structure here. */
//    public L705() {
//        table = new boolean[buckets][];
//    }
//
//    public int hash(int key) {
//        return key % buckets;
//    }
//
//    public int pos(int key) {
//        return key / buckets;
//    }
//
//    public void add(int key) {
//        int hashkey = hash(key);
//
//        if (table[hashkey] == null) {
//            table[hashkey] = new boolean[itemsPerBucket];
//        }
//        table[hashkey][pos(key)] = true;
//    }
//
//    public void remove(int key) {
//        int hashkey = hash(key);
//
//        if (table[hashkey] != null) {
//            table[hashkey][pos(key)] = false;
//        }
//
//    }
//
//    /** Returns true if this set did not already contain the specified element */
//    public boolean contains(int key) {
//        int hashkey = hash(key);
//        return table[hashkey] != null && table[hashkey][pos(key)];
//    }

//    性能最好的如下
//    60ms ~ 150ms

    private long[] bits;

    /** Initialize your data structure here. */
    public L705() {
        bits = new long[1000001 >> 6 + 1];
    }

    public void add(int key) {
        int offset = key >> 6;
        bits[offset] |= 1L << key;
    }

    public void remove(int key) {
        int offset = key >> 6;
        bits[offset] &= ~(1L << key);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int offset = key >> 6;
        return (bits[offset] & (1L << key)) != 0;
    }




    public static void main(String[] args) {
        L705 obj = new L705();
        String[] todo = new String[]{"contains","remove","add","add","contains","remove","contains","contains","add","add","add","add","remove","add","add","add","add","add","add","add","add","add","add","contains","add","contains","add","add","contains","add","add","remove","add","add","add","add","add","contains","add","add","add","remove","contains","add","contains","add","add","add","add","add","contains","remove","remove","add","remove","contains","add","remove","add","add","add","add","contains","contains","add","remove","remove","remove","remove","add","add","contains","add","add","remove","add","add","add","add","add","add","add","add","remove","add","remove","remove","add","remove","add","remove","add","add","add","remove","remove","remove","add","contains","add"};
        int[] s = new int[]{72,91,48,41,96,87,48,49,84,82,24,7,56,87,81,55,19,40,68,23,80,53,76,93,95,95,67,31,80,62,73,97,33,28,62,81,57,40,11,89,28,97,86,20,5,77,52,57,88,20,48,42,86,49,62,53,43,98,32,15,42,50,19,32,67,84,60,8,85,43,59,65,40,81,55,56,54,59,78,53,0,24,7,53,33,69,86,7,1,16,58,61,34,53,84,21,58,25,45,3};
        Boolean[] result = new Boolean[]{false,null,null,null,false,null,true,false,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,false,null,true,null,null,true,null,null,null,null,null,null,null,null,true,null,null,null,null,false,null,false,null,null,null,null,null,true,null,null,null,null,true,null,null,null,null,null,null,true,true,null,null,null,null,null,null,null,false,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,false,null};
        for (int x = 0; x < todo.length; x++) {
            if (true) {
                if (s[x] == 95){
                    System.currentTimeMillis();
                }
                if ("contains".equals(todo[x])) {
                    Boolean a = obj.contains(s[x]);
                    if (!a.equals(result[x])) {
                        System.out.println(s[x]);
                    }
                    System.out.println("contains:" + a + x);
                }
                if ("remove".equals(todo[x])) {
                    obj.remove(s[x]);
                    System.out.println("remove:" + x);
                }
                if ("add".equals(todo[x])) {
                    obj.add(s[x]);
                    System.out.println("add:" + x);
                }
            }
        }
    }
}

//[null,false,null,null,null,false,null,true,false,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,false,null,false,null,null,true,null,null,null,null,null,null,null,null,true,null,null,null,null,false,null,false,null,null,null,null,null,true,null,null,null,null,true,null,null,null,null,null,null,true,false,null,null,null,null,null,null,null,false,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,false,null]
//[null,false,null,null,null,false,null,true,false,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,false,null,true,null,null,true,null,null,null,null,null,null,null,null,true,null,null,null,null,false,null,false,null,null,null,null,null,true,null,null,null,null,true,null,null,null,null,null,null,true,true,null,null,null,null,null,null,null,false,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,false,null]