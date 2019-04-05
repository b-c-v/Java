package com.bcv;


public class Temp {
    public static void main(String... args) {
        if (x() | f()) {
            System.out.println("Hello");
        }
    }

    static boolean f() {
        System.out.println("Method f");
        return false;
    }

    static boolean x() {
        System.out.println("Method x");
        return false;
    }
}
















