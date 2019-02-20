package com.bcv.HorstmannBook.Chapter7;

/*Write code that fills an array values with each set of numbers below*/

public class FillsArrayR7_5 {
    public static void main(String[] args) {
        int[] values = new int[11];


        for (int i = 0; i < values.length-1; i++) {
            values[i] = i + 1; //1 2 3 4 5 6 7 8 9 10
            System.out.print(values[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < values.length; i++) {
            values[i] = i * 2; //0 2 4 6 8 10 12 14 16 18 20
            System.out.print(values[i] + " ");
        }

        System.out.println();

        for (int i = 1; i < values.length; i++) {
            values[i] = i * i; //1 4 9 16 25 36 49 64 81 100
            System.out.print(values[i] + " ");
        }

        System.out.println();

        for (int i = 1; i < values.length; i++) {
            values[i] = 0; //0 0 0 0 0 0 0 0 0 0
            System.out.print(values[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < values.length-1; i++) {
            values[i] = i%2; //0 1 0 1 0 1 0 1 0 1
            System.out.print(values[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < values.length-1; i++) {
            values[i] = i%5; //0 1 2 3 4 0 1 2 3 4
            System.out.print(values[i] + " ");
        }
    }

}