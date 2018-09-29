package com.bcv.hw;

import java.util.Scanner;


/*Напишите метод переводящий гривны в доллары по заданному курсу. В качестве
аргументов передайте кол-во гривен и курс.*/

public class Task14 {
    static void rate() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of grivnas: ");
        double grivnas = in.nextDouble();

        System.out.print("Enter exchange rate: ");
        double dollars = in.nextDouble();
        System.out.println("You can buy " + grivnas / dollars + " dollars");

    }

    public static void main(String[] args) {
        rate();
    }
}
