package com.bcv.homeWorkLemon.Lection1;


//Дано значение температуры в градусах Цельсия. Вывести температуру в градусах Фаренгейта.

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float celsius = input.nextFloat();

        float fahrenheit = ((float)1.8 * celsius) + 32;
        System.out.println("The temperature is " + fahrenheit + " Fahrenheits");
    }

}
