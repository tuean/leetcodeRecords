package com.tuean.LeetCode.L100toL199;

public class L168 {

//    1 -> A
//    2 -> B
//    3 -> C
//    ...
//
//    26 -> Z
//    27 -> AA
//    28 -> AB
//    ...

//    挺有意思的一道 数学题
//    相反的过程在L171

    public String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle((n - 1) / 26) + (char) ((n - 1) % 26 + 'A');
    }
}
