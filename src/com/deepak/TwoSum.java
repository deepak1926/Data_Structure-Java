package com.deepak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

public class TwoSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        list = twoSum(list,9);
        System.out.println(list);
    }

    private static ArrayList<Integer> twoSum(ArrayList<Integer> list, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i< list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    ans.add(i);
                    ans.add(j);
                }
            }
        }
        return ans;
    }
}
