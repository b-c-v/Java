package com.bcv.hw.Lection13;


import java.util.Scanner;

/**
 * Program finding maximum of two numbers without using if-else or any other comparison operator
 */

public class MaxNumber {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = aScanner.nextInt();
        System.out.print("Enter second number: ");
        int y = aScanner.nextInt();
        int z = (Math.abs(x - y) + Math.abs(x + y)) / 2;
        System.out.println(z);

    }

}
