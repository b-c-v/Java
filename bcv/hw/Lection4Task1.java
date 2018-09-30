/*
На основе документации по классу Math написать программу, которая вычисляет и печатает синус и косинус 30.
Нужно учесть, что стандартные методы класса Math ожидают параметр в радианах. Поэтому нам нужно преобразовать 30 в нужное число радиан.
Рассмотрим, как реализовать преобразование строки в число. Это нам понадобится для написания более универсальных программ,
в которых мы сможем, скажем, вычислять синус и косинус от произвольного аргумента.
Для этого рассмотрим класс Double и найдем в нем метод parseDouble(...).
Теперь преобразуем нашу программу так, чтобы она могла вычислять синус и косинус произвольного аргумента в градусах.
Программа должна принимать один параметр вызова (args[0]), преобразовывать его в нужное число радиан, вычислять синус и косинус и
печатать аргумент и значение синуса и косинуса.
*/

package com.bcv.hw;

import java.util.Scanner;

public class Lection4Task1 {

    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Enter number, and I will find cos and sin: ");
        String n = aScanner.next();

        //change String to double with help of Double.parseDouble
        double degree = Double.parseDouble(n);

        //change degree to radians with help of Math.toRadians
        double radians = Math.toRadians(degree);
       String radiansString =  String.format ("%.2f", radians);

        //find sin
        double sin = Math.sin(radians);
        String sinString = String.format("%.2f", sin);

        //find cos
        double cos = Math.cos(radians);
        String cosString = String.format("%.2f", cos);

        System.out.println("You enter " + n + " degrees" + ". It's equal " + radiansString + " radians. Cos is: " + cosString + " and sin is: " + sinString);

    }
}



