package com.deepak;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12,34,22,45,77,88,12};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reverse Array");
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

