package com.deepak;

import java.util.Arrays;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenNumberDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(Arrays.toString(nums));
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count =0;
        for(int ele : nums){
            if(even2(ele)){
                count++;
            }
        }
        return count;
    }
    //Method1
    static boolean even(int num){
        String len = String.valueOf(num);
        if(len.length()%2==0)
                return true;
        return false;
    }
    //Method2
    static boolean even2(int num){
        int digit = digits(num);
        if(digit%2==0)
            return true;
        return false;
    }
    static int digits(int num){
        return (int)Math.log10(num)+1;
    }
}
