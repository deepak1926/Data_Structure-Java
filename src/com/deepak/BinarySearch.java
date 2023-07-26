package com.deepak;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,23,45,67,89,91,99};
        System.out.println(binarysearch(arr,99));
    }
    private static boolean binarysearch(@org.jetbrains.annotations.NotNull int[] arr, int item) {
        int start =0;
        int end = arr.length-1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(item==arr[mid])
                return true;
            if(item>arr[mid]) {
                start++;
            }else{
               end--;
            }
        }
        return false;
    }
}
