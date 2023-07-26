package com.deepak;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        switch (day) {
            case "Monday" -> System.out.println("Monday");
            case "Tuesday" -> System.out.println("Tuesday");
            case "Wednesday" -> System.out.println("Wednesday");
            case "Thursday" -> System.out.println("Thursday");
            default -> System.out.println("Wrong");
        }
    }
}
