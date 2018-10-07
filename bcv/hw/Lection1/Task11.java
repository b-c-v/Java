package com.bcv.hw.Lection1;

//Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с клавиатуры.

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = in.nextInt();
        for (int i = 1; i < 11; i++)
            System.out.println(number + " * " + i + " = " + number * i);
    }
}
