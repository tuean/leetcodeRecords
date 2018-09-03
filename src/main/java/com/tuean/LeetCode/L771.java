package com.tuean.LeetCode;

public class L771 {


    public int numJewelsInStones(String J, String S) {

        if (J == null || S == null) return 0;

        int result = 0;
        for (int x = 0; x < S.length(); x++) {
            for (int y = 0; y < J.length(); y++) {
                if (J.charAt(y) == S.charAt(x)) {
                    result++;
                    break;
                }
            }
        }

        return result;
    }

}
