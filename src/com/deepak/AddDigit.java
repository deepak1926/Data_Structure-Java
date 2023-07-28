package com.deepak;
//https://leetcode.com/problems/add-digits/

import java.util.Scanner;

/**
 * Input: num = 38
 * Output: 2
 * Explanation: The process is
 * 38 --> 3 + 8 --> 11
 * 11 --> 1 + 1 --> 2
 * Since 2 has only one digit, return it.
 */
public class AddDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(addDigits(in.nextInt()));
        System.out.println(addDigits2(in.nextInt()));
    }
    static int addDigits(int num) {
        if(num==0)
            return 0;
        for(int i=1;i<=3;i++){
            if(num>=0 && num<10)
                return num;
            int ans = 0;
            while(num>0){
                int digit = num%10;
                ans +=digit;
                num/=10;
            }
            num = ans;
        }
        return num;
    }
    //second method
    static int addDigits2(int num){
        if(num>=0 && num<10)
            return num;
        int ans = 0;
        while(num>0) {
            int digit = num % 10;
            ans += digit;
            num /= 10;
        }
        return addDigits2(ans);
    }
}
