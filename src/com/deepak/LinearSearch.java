package com.deepak;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,34,46,78,98,23,45};
        System.out.println(Arrays.toString(arr));
        System.out.println(linearSearch(arr,46));
    }

    private static boolean linearSearch(int[] arr,int item) {
        for(int ele : arr){
            if(ele==item)
                return true;
        }
        return false;
    }
}
