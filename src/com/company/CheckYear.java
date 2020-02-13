package com.company;

import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Year;

        System.out.println("Enter a Year: ");
        Year = sc.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 =Year%4==0;
        if (isDivisibleBy4){
            boolean isDivisibleBy100 = Year%100 ==0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = Year%400 ==0;
                if (isDivisibleBy400){
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }
        if (isLeapYear){
            System.out.printf("%d is a leap year", Year);
        }else {
            System.out.printf("%d is NOT a leap year",Year);
        }
    }
}
