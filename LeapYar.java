package com.BridgeLabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        int y = year.nextInt();
        year.close();

        if (y < 999 && y > 9999) {
            System.out.println("You entered wrong year");
        } else if (y % 4 == 0) {
            System.out.println(y + " "+ "is a Leap year");
        } else {
            System.out.println(y +" "+ "is not a Leap year");
        }
    }
}
