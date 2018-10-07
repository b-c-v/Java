//Напишите метод удаления заданного символа из строки.

package com.bcv.hw.Lection4;


import java.util.Scanner;

public class Lection4Task8 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = myScanner.nextLine();
        System.out.print("Enter symbol: ");
        String symbol = myScanner.next();

        String replace = sentence.replaceAll(symbol, "");
        System.out.println("The sentence without this symbol is: " + replace);
    }
}

