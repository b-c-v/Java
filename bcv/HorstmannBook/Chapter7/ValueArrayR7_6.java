package com.bcv.HorstmannBook.Chapter7;

/*Write code that fills an array values with each set of numbers below*/

public class ValueArrayR7_6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        int total = 0;

        for (int i = 0; i < a.length - 1; i++) {
            total = total + a[i];
        }
        System.out.println(total);

        total = 0;
        for (int i = 0; i < a.length; i = i + 2) {
            total = total + a[i];
        }
        System.out.println(total);

        total = 0;
        for (int i = 1; i < a.length; i = i + 2) {
            total = total + a[i];
        }
        System.out.println(total);

        total = 0;
        for (int i = 2; i < a.length; i = i + 2) {
            total = total + a[i];
        }
        System.out.println(total);

        total = 0;
        for (int i = 1; i < a.length; i = i * 2) {
            total = total + a[i];
        }
        System.out.println(total);

        total = 0;
        for (int i = 9; i >=0; i --) {
            total = total + a[i];
        }
        System.out.println(total);

        total = 0;
        for (int i = 1; i >=0; i = i - 2) {
            total = total + a[i];
        }
        System.out.println(total);



    }


}