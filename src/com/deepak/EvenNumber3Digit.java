package com.deepak;

import java.util.ArrayList;
import java.util.Arrays;

/**
* Input: digits = [2,1,3,0]
* Output: [102,120,130,132,210,230,302,310,312,320]
* Explanation: All the possible integers that follow the requirements are in the output array.
*
*  213 210 1
 *  102 120 130 132 210 230 302 310 312 320
* */
public class EvenNumber3Digit {
    public static void main(String[] args) {
        int[] digits = {2,1,3,0};
        int []ans = findEvenNumbers(digits);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(10);
        return new int[]{};
    }
}
