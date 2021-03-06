package com.tuean.LeetCode.L1toL99;

import java.util.ArrayList;
import java.util.List;

public class L60 {


    public String getPermutation(int n, int k) {
        int sum = 1;
        int[] factorial = new int[n+1];
        factorial[0] = 1;
        for(int i=1; i<=n; i++){
            sum *= i;
            factorial[i] = sum;
        }

        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=n; i++){
            numbers.add(i);
        }

        k--;

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            int index = k/factorial[n-i];
            sb.append(String.valueOf(numbers.get(index)));
            numbers.remove(index);
            k-=index*factorial[n-i];
        }

        return String.valueOf(sb);
    }


}
