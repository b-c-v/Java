//узнать является ли число палиндромом

package com.bcv.lessons;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner ascanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int myNumber = ascanner.nextInt();
        int origin = myNumber;
        int revers = 0;
        while (myNumber > 0) {
            int tWhile = myNumber % 10;
            System.out.println("tWhile = myNumber % 10 = " + tWhile + "; myNumber = " + myNumber + "; revers = " + revers);
            revers = 10 * revers + tWhile;
            System.out.println("revers = 10 * revers + tWhile = " + revers + "; tWhile = " + tWhile);
            myNumber = myNumber / 10;
            System.out.println("myNumber = myNumber / 10 = " + myNumber);
        }
        if (origin == revers) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Ne palindrome");
        }
    }
}
