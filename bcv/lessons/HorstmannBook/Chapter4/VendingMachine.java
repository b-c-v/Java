package com.bcv.lessons.HorstmannBook.Chapter4;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        /*Scanner aScanner = new Scanner(System.in);
        System.out.print("Enter the bill: ");
        double billValue = aScanner.nextDouble();
        System.out.print("Enter the item price: ");
        double itemPrice = aScanner.nextDouble();*/
        double billValue = 54.25;
        double itemPrice = 14.47;

        double difference = billValue - itemPrice; //39.78 coins
        System.out.println(difference);
        int coins = (int)(difference*100); //3978 coins

        int tmp = coins%10;
        System.out.println(tmp);
        int tmp1 = (coins-tmp)/10;
        System.out.println(tmp1);



        double coin1 = 0.01;
        double coin2 = 0.02;
        double coin5 = 0.05;
        double coin10 = 0.10;
        double coin25 = 0.25;
        double coin50 = 0.50;
        double grivna1 = 1.00;
        double grivna2 = 2.00;
        double grivna5 = 5.00;
        double grivna10 = 10.00;
        double grivna20 = 20.00;
        double grivna50 = 50.00;
        double grivna100 = 100.00;
        double grivna200 = 200.00;
        double grivna500 = 500.00;


    }
}
