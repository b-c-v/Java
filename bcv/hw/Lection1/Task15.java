package com.bcv.hw.Lection1;

//Даны катеты прямоугольного треугольника. Найдите площадь, периметр и гипотенузу треугольника.

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first catenary: ");
        double firstCatenary = input.nextDouble();

        System.out.print("Enter second catenary: ");
        double secondCatenary = input.nextDouble();

        double hypotenuse = Math.sqrt((firstCatenary * firstCatenary) + (secondCatenary * secondCatenary));
        System.out.println("The hypotenuse is: " + hypotenuse);

        double perimeter = hypotenuse + firstCatenary + secondCatenary;
        System.out.println("The perimeter is: " + perimeter);

        double area = (firstCatenary * secondCatenary) / 2;
        System.out.println("The area is: " + area);

    }


}
