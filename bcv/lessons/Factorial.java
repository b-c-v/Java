//найти факториал числа

package com.bcv.lessons;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        loop();
    }

    private static void loop() {
        int res = 1;
        Scanner push = new Scanner(System.in);
        System.out.print("Enter number from 1 to 12 for find factorial: ");
        int fac = push.nextInt();

        if (fac > 0 && fac <= 12) {
            for (int i = fac; i >= 2; i--) {
                res = res * i;
                //System.out.println("res: " + res + " i: " + i);
            }
            System.out.println("Factorial is: " + res);
        } else {
            System.out.print("Please enter correct number. ");
            loop();
        }
    }
}
