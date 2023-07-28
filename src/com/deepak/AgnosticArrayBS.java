package com.deepak;

public class AgnosticArrayBS {
    public static void main(String[] args) {
//        int[] arr = {-12,-10,-9,-4,0,1,6,12,23,45,67,89,99,100,123,134,156};
        int target =-1;
        int arr[] = {99,88,77,66,55,44,33,22,10,8,-1,-10,-100};
        int ans = agnosticBS(arr,target);
        System.out.println(ans);
    }

    private static int agnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
