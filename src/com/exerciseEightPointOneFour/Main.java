package com.exerciseEightPointOneFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateClass dateClass = new DateClass();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for day of the month: ");
        int day = input.nextInt();
        dateClass.setDay(day);

        System.out.println("Enter a value for month of the year as an integer: ");
        int integerMonth = input.nextInt();
        dateClass.setMonth(integerMonth);

        System.out.println("Enter a value for year: ");
        int year = input.nextInt();
        dateClass.setYear(year);

        System.out.printf("The date is %d/%d/%d",dateClass.getMonth(),dateClass.getDay(),dateClass.getYear());
    }

}
