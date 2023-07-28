package com.deepak;
//https://leetcode.com/problems/smallest-even-multiple/

import java.util.Scanner;

/**
 *
 *Input: n = 5
 * Output: 10
 * Explanation: The smallest multiple of both 5 and 2 is 10.
 *
 * */
public class SmallEvenMultiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(smallestEvenMultiple(in.nextInt()));
        System.out.println(smallestEvenMultiple2(in.nextInt()));
    }
    public static int smallestEvenMultiple(int n) {
        for(int i=2;i<=Integer.MAX_VALUE;i++){
            if(i%2==0 && i%n==0)
                return i;
        }
        return -1;
    }
    //method 2
    static int smallestEvenMultiple2(int n){
        if(n%2==0){
            return (n/2)*2;
        }
        return n*2;
    }
}
