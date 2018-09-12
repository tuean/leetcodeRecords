package com.tuean.LeetCode.L500toL599;

public class L520 {


    public boolean detectCapitalUse(String word) {

        if (word == null) {
            return false;
        }
        boolean allUpper = true;
        boolean allLower = true;
        boolean fisrtUpp = true;


        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                allLower = false;
                break;
            }
        }
        if(allLower) return true;

        for(int i = 0; i < word.length(); i++){
            if(Character.isLowerCase(word.charAt(i))){
                allUpper = false;
                break;
            }
        }
        if(allUpper) return true;

        for(int i = 0; i < word.length(); i++){
            if((i == 0 && Character.isLowerCase(word.charAt(i))) || (i != 0 && Character.isUpperCase(word.charAt(i)))){
                fisrtUpp = false;
                break;
            }
        }
        if(fisrtUpp) return true;
        return false;
    }

}
