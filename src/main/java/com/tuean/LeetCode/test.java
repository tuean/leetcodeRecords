package com.tuean.LeetCode;

import java.util.Scanner;

public class test {


    public static void main(String[] args) {
        Integer[] prices = new Integer[1000000];
        Scanner in =  new Scanner(System.in);
        int x = 0;
        while (in.hasNextInt()) {
            prices[x] = in.nextInt();
        }


        if(prices.length==0) System.out.println(0);
        int local = 0;
        int global = 0;
        for(int i=0;i<prices.length-1;i++)
        {
            local = Math.max(local+prices[i+1]-prices[i],0);
            global = Math.max(local, global);
        }
        System.out.println(global);
    }
}
