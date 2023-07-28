package com.deepak;
import java.util.Arrays;
public class ArrayManipulation {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Deepak", "Mohit","Saurabh","Aakash","Aushadhi","Driti"
        } ;
        String []copyTo = Arrays.copyOfRange(copyFrom,0,copyFrom.length);
        for (String name:copyTo
             ) {
            System.out.println("Name: "+name);
        }
//        Searching an array for a specific value to get the index at which it is placed
//        (the binarySearch method).
        int[] arr = {1,2,3,4,5,6,7,8,9,10,12,23};
        System.out.println(Arrays.binarySearch(arr,8));
//        This is not wornking on descending array
        int []desArr = {10,9,8,7,6,5,4,3,2,1};
//        System.out.println(Arrays.binarySearch(desArr,7));

        //Comparing two arrays to determine if they are equal or not (the equals method)
        System.out.println(Arrays.equals(arr,desArr));

//      filling an array to place a specific value at each index (the fill method).
        int []fillArray = new int[7];
        Arrays.fill(fillArray,10);
        System.out.println(Arrays.toString(fillArray));

        //Sorting an array into ascending order.
        int []arr2 = {12,45,22,67,32,10,98,23,78,45};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //second method
        int []arr3 = {12,45,22,67,32,10,34,56,78,33,11,23,98,23,78,45};
        Arrays.parallelSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
