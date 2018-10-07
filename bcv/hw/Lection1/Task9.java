package com.bcv.hw.Lection1;

//Сделайте программу, которая будет проверять является ли число типа double целым.

public class Task9 {
    public static void main(String[] args) {
        double x = 24.02;
        if (x % 2 == 0)
            System.out.println("Integer/Целое");
        else
            System.out.println("Fractional/Дробное");
    }

}
