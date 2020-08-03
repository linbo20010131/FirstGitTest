package com.yr;

import java.util.Scanner;

public class DayCounting {
    public static void main(String[] args) {
        int[][] data = {
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年月日(1980 11 28): ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int date = sc.nextInt();
        int[] daysOfMonth = data[(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0];
        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += daysOfMonth[i];
        }
        sum += date;
        System.out.println(sum);
        sc.close();
    }
}