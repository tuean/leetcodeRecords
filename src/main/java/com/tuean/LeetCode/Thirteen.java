//package com.tuean.LeetCode;
//
//import java.util.Arrays;
//import java.util.List;
//
///**
// * Created by zhongxiaotian on 2018/1/24.
// */
//public class Thirteen {
//
//    public static String longestCommonPrefix(String[] strs) {
//        if(strs == null || strs.length < 1){
//            return null;
//        }
//
//        List<String> tmp = Arrays.asList(strs);
//
//        //x位数 y 数组长度
//        StringBuffer sb = new StringBuffer();
//        for(int x = 0; tmp.size() > x; x++){
//            if(tmp.get(x).trim().equals("")){
//                return null;
//            }
//            String temp = tmp.get(x).charAt(a) + "";
//            for(int y = 0; tmp.size() > y; y++){
//                if( !(tmp.get(y).length() >= a && temp.equals(tmp.get(x).charAt(a) + "")) ){
//                    break;
//                }
//            }
//            sb.append(temp);
//            a++;
//        }
//
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[]{"a", "b"}));
//    }
//}
