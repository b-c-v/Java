package com.bcv.lessons;

public class Recursion {
    public static void main(String[] args) {
        methotRecursion(1);
    }

    private static void methotRecursion(int arg) {
        System.out.print(arg + " ");
        if (arg < 7) {
            //call method inside himself
            methotRecursion(2 * arg);
        }

        System.out.print(arg + " ");

    }
}
