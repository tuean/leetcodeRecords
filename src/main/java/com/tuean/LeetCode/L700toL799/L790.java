package com.tuean.LeetCode.L700toL799;

import java.util.HashMap;
import java.util.Map;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.MOD;

public class L790 {

//    1 = |
//    2 = || or 二
//    3 = double L

//    dp[0] = 0;
//    dp[1] = 1;
//    dp[2] = 2;
//    dp[3] = 5;
//    dp[4] = 11;
//    dp[5] = 24;
//    dp[n] = dp[n-1] + dp[n-2] + 2(dp[n-3] + ... + dp[0])
//    dp[n] = 2dp[n-1] + dp[n-3]

    public static int numTilings(int N) {

        if (N < 0){
            return 0;
        }
        int mod = 1_000_000_007;
        Map<Integer, Long> map = new HashMap<>();
        map.put(0, 0L);
        map.put(1, 1L);
        map.put(2, 2L);
        map.put(3, 5L);
        int i = 4;
        while(i <= N){
            map.put(i, (2*map.get(i-1) + map.get(i-3)) % mod);
            i++;
        }
        return map.get(N).intValue();
    }


    public static void main(String[] args) {
        System.out.println(numTilings(30));
    }
}
