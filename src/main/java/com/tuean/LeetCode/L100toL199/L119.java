package com.tuean.LeetCode.L100toL199;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L119 {


//    第n行的m个数可表示为C(n-1,m-1)
//    C(n,m)=n!/[m!(n-m)!]

    public static List<Integer> getRow(int rowIndex) {
        rowIndex++;
        Integer[] list = new Integer[rowIndex];
        if (rowIndex == 1) {
            list[0] = 1;
            return Arrays.asList(list);
        } else if (rowIndex == 2) {
            list[0] = 1; list[1] = 1;
            return Arrays.asList(list);
        } else {
            int mid = rowIndex / 2 + 1;
            for (int x = 0; x < mid; x++){
                if (x == 0) {
                    list[0] = 1;
                    list[rowIndex - 1] = 1;
                    continue;
                }
                int tmp = get(rowIndex, x + 1).intValue();
                list[x] = tmp;
                list[rowIndex - x - 1] = tmp;
            }
        }
        return Arrays.asList(list);
    }

    private static Long get(int n, int m) {
        Long a = factorialRecursive(n - 1);
        Long b = factorialRecursive(m - 1);
        Long c = factorialRecursive(n - m);
        return a / (b * c);
    }

    public static Long factorialRecursive(int n) {
        if (n < 0) { return 1L; }
        if (n == 0) { return 1L; }
        if (n < 2) { return n * 1L; }

        return n * factorialRecursive(n - 1);
    }


    // 这道题优先用累加 用阶乘会有数据过大的风险


    public static List<Integer> getRow1(int rowIndex){
        List<Integer> list = new ArrayList<Integer>();
        if (rowIndex < 0) return list;

        for (int i = 0; i < rowIndex + 1; i++) {
            list.add(0, 1);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(getRow(21));
        System.out.println(getRow1(21));
    }

}
