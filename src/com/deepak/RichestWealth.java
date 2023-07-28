package com.deepak;

import java.util.Arrays;

// https://leetcode.com/problems/richest-customer-wealth/
public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        for (int[] account : accounts) {
            System.out.println(Arrays.toString(account));
        }
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > max)
                max = sum;
        }
        return max;
    }
}
