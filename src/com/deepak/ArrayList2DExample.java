package com.deepak;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2DExample {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(3);
        for(int i=1;i<=3;i++){
            list.add(new ArrayList<>());
        }
        Scanner in = new Scanner(System.in);
        for(int row=0;row< list.size();row++){
            for(int col=0;col<3;col++){
                list.get(row).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
