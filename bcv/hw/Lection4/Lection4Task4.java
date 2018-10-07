//Изменить SymbolTest.java так, чтобы количество генерируемых символов задавалось пользователем.

package com.bcv.hw.Lection4;

import java.util.Scanner;

public class Lection4Task4 {


    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Enter number of generated characters: ");
        int number = aScanner.nextInt();
        for (int i = 0; i < number; i++) {
            char c = (char) (Math.random() * 26 + 'a');
            System.out.print(c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("гласная");
                    break;
                case 'y':
                case 'w':
                    System.out.println("иногда гласная");
                    break;
                default:
                    System.out.println("согласная");
            }
        }

    }

}


