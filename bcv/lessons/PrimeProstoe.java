package com.bcv.lessons;

import java.util.Scanner;

public class PrimeProstoe {
    public static void main(String[] args) {
        Scanner push = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = push.nextInt();
        int mark = 0;
        for (int i = 2; i <=Math.sqrt(number); i++) {
            if (number % i == 0) {
                mark = 1;
                break;
            }
        }
        if (mark == 1) {
            System.out.println("ne Prostoe");
        } else {
            System.out.println("Prostoe");
        }
    }

}
