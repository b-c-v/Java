package com.bcv.lessons;

public class Initialisation {
    public static void main(String[] args) {
        // new initB(); //2 5 1 3 4 6
        new initA(); //2 1 3
        new initB(); //5 1 3 4 6 в 2 не заходит т.к. в static блок заходит один раз при его предыдущей инициализации
    }


}

class initA {
    {
        System.out.println("initialisation#A 1");
    }

    static {
        System.out.println("initialisation#StaticA 2");
    }

    initA() {
        System.out.println("constructor#A 3");
    }

}

class initB extends initA {
    {
        System.out.println("initialisation#B 4");
    }

    static {
        System.out.println("initialisation#StaticB 5");
    }

    initB() {
        System.out.println("constructor#B 6");
    }

}