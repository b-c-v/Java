package com.bcv.hw;

//Напишите программу которая определяет какое из чисел больше

public class Task7 {
    public static void main(String[] args) {
        int x, y;
        x = 15;
        y = 22;
        if (x > y)
            System.out.println("The biggest number is " + x);
        if (x < y)
            System.out.println("The biggest number is " + y);
        else
            System.out.println("Numbers are equal");
    }
}
