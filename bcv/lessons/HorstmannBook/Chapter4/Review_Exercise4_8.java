package com.bcv.lessons.HorstmannBook.Chapter4;

import javax.xml.bind.SchemaOutputResolver;

public class Review_Exercise4_8 {
    public static void main(String[] args) {
        double x = 2.5;
        double y = -1.5;
        int m = 18;
        int n = 4;

        System.out.println(x + n * y - (x + n) * y);
        System.out.println(m / n + m % n);
        System.out.println(5 * x - n / 5);
        System.out.println(1 - (1 - (1 - (1 - (1 - n)))));
        System.out.println(Math.sqrt(n));
        System.out.println(n / 10 + n % 10);
        System.out.println(n % 2 + m % 2);
        System.out.println((m + n) / 2);
        System.out.println((m + n) / 2.0);
        System.out.println((int) (0.5 * (m + n)));
        System.out.println((int)Math.round(0.5*(m+n)));
    }
}

