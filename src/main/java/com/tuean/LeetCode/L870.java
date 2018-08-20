package com.tuean.LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeMap;

//Given two arrays A and B of equal size, the advantage of A with respect to B is the number of indices i for which A[i] > B[i].

//        Return any permutation of A that maximizes its advantage with respect to B.


public class L870 {

    // todo 需要再详细看下
    public static int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        int n=A.length;
        int[] res= new int[n];
        PriorityQueue<int[]> pq= new PriorityQueue<>((a, b)->b[0]-a[0]);
        for (int i=0; i<n; i++) {
            pq.add(new int[]{B[i], i});
        }
        int lo=0, hi=n-1;
        while(!pq.isEmpty()){
            int[] cur= pq.poll();
            int idx=cur[1], val=cur[0];
            if (A[hi]>val) {
                res[idx]=A[hi--];
            } else {
                res[idx]=A[lo++];
            }
        }
        return res;
    }

    public static int[] advantageCount1(int[] A, int[] B) {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int i : A) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; ++i) {
            Integer x = m.higherKey(B[i]);
            if (x == null) {
                x = m.firstKey();
            }
            m.put(x, m.get(x) - 1);
            if (m.get(x) == 0) {
                m.remove(x);
            }
            res[i] = x;
        }
        return res;
    }


    public static void main(String[] args) {
        // A = [2,7,11,15], B = [1,10,4,11]
        int[] a = new int[]{2,7,11,15};
        int[] b = new int[]{1,10,4,11};
        System.out.println(advantageCount(a, b));
    }
}
