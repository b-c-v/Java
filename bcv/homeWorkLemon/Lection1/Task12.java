package com.bcv.homeWorkLemon.Lection1;

/*Пользователь вводит задает расстояние до места назначения (N) и время, за которое
нужно доехать (T). Вычислить скорость (км/ч), с которой нужно ехать.*/

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter distance (km): ");
        int d = in.nextInt();
        System.out.print("Enter time (hours): ");
        int t = in.nextInt();
        double v = (double) d / t;
        System.out.println("The speed is: " + v + " km/h");
    }
}
