package com.tuean.LeetCode.L800toL899;

import java.util.ArrayList;
import java.util.List;

public class L855 {

    int N;
    List<Integer> list = new ArrayList<>();
    public L855(int n) {
        this.N = n;
    }

    public int seat() {
        if (list.size() == 0) {
            list.add(0);
            return 0;
        }
        int d = Math.max(list.get(0), N - 1 - list.get(list.size() - 1));
        for (int x = 0; x < list.size() - 1; ++x) {
            d = Math.max(d, (list.get(x + 1) - list.get(x)) / 2);
        }
//      走的只剩一个学生了
        if (list.get(0) == d) {
            list = new ArrayList<>();
            list.add(0);
            return 0;
        }
        for (int x = 0; x < list.size() - 1; ++x) {
            if ((list.get(x + 1) - list.get(x)) / 2 == d) {
                list.add(x + 1, list.get(x + 1) / 2 + list.get(x) / 2);
                return list.get(x + 1);
            }
        }
        list.add(N - 1);
        return N - 1;
    }

    public void leave(int p) {
        for (int x = 0; x < list.size(); ++x) {
            if (list.get(x) == p) {
                list.remove(x);
                break;
            }
        }
    }

    public static void main(String[] args) {
        L855 l = new L855(9);
        l.seat();
        l.seat();
        l.seat();
        l.seat();
    }

}
