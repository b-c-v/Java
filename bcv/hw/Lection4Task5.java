/*Написать программу, которая в качестве параметров вызова принимает два числа -
 длины катетов прямоугольного треугольника, а в качестве результата печатает углы в градусах.*/

package com.bcv.hw;

import java.util.Scanner;

public class Lection4Task5 {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Enter length first catenary: ");
        double catenary1 = aScanner.nextDouble();
        System.out.print("Enter length second catenary: ");
        double catenary2 = aScanner.nextDouble();

        double angleFirst = Math.toDegrees(Math.atan(catenary1 / catenary2));

        double angleSecond = 90 - angleFirst;

        String angleFirstString = String.format("%.2f", angleFirst);
        String angleSecondString = String.format("%.2f", angleSecond);
        System.out.println("The first angle is: " + angleFirstString + " degrees. The second angle is: " + angleSecondString + " degrees.");
    }
}