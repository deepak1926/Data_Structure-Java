package com.deepak;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        System.out.println(list);
        System.out.println("Element by get method");
        for(int i=0;i< list.size();i++){
            System.out.printf(list.get(i)+" ");
        }
    }
}
