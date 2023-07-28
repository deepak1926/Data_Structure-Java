package com.deepak;

public class CopyArray {
    public static void main(String[] args) {
        String [][]names = {
                {"Mr.","Mrs.","Dr."},
                {"Deepak","Aushadhi","Saurabh"},
                {"Satankar","Agrawal","Satankar"}
        };
        String [][] copyTo = new String[3][3];
        System.arraycopy(names,0,copyTo,0,3);
        for(String []ele:copyTo){
            for(String name : ele){
                System.out.println(name);
            }
        }
    }
}
