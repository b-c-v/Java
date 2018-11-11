package com.bcv.lessons.HorstmannBook.Chapter5;

/*Write a program that converts a positive integer into th Roman number system.*/

import java.util.Scanner;

/**
 * Program converts a positive integer number in Roman number
 */
public class RomanNumbersP5_9 {
    public static void main(String[] args) {

        Scanner aScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int myNumber = aScanner.nextInt();

        int numberToRoman = 0;
        String StringRomanNumbers = "";
        int x = 1;
/**
 * Loop for computing numbers what need to convert
 * */
        while (myNumber > 0) {

            int tWhile = myNumber % 10;
            myNumber = myNumber / 10;

            String SymbolRomanNumber = returnChar(tWhile * x);
            x = x * 10;

            StringRomanNumbers = SymbolRomanNumber + StringRomanNumbers;

        }
        System.out.println(StringRomanNumbers);
    }

    /**
     * Method convert integer number in Roman
     *
     * @param convertNumber the number what need convert
     * @return symbol of Roman number
     */
    private static String returnChar(int convertNumber) {
        String n = "";
        if (convertNumber == 3000) {
            n = "МММ";
        } else if (convertNumber == 2000) {
            n = "ММ";
        } else if (convertNumber == 1000) {
            n = "M";
        } else if (convertNumber == 500) {
            n = "D";
        } else if (convertNumber == 100) {
            n = "C";
        } else if (convertNumber == 50) {
            n = "L";
        } else if (convertNumber == 10) {
            n = "X";
        } else if (convertNumber == 5) {
            n = "V";
        } else if (convertNumber == 1) {
            n = "I";
        } else if (convertNumber % 9 == 0) {
            if (convertNumber % 100 == 0) {
                n = "CM";
            } else if (convertNumber / 10 > 0) {
                n = "XC";
            } else {
                n = "IX";
            }
        } else if (convertNumber % 8 == 0) {
            if (convertNumber % 100 == 0) {
                n = "DCCC";
            } else if (convertNumber / 10 > 0) {
                n = "LXXX";
            } else {
                n = "VIII";
            }
        } else if (convertNumber % 7 == 0) {
            if (convertNumber % 100 == 0) {
                n = "DCC";
            } else if (convertNumber / 10 > 0) {
                n = "LXX";
            } else {
                n = "VII";
            }
        } else if (convertNumber % 6 == 0) {
            if (convertNumber % 100 == 0) {
                n = "DC";
            } else if (convertNumber / 10 > 0) {
                n = "LX";
            } else {
                n = "VI";
            }
        } else if (convertNumber % 4 == 0) {
            if (convertNumber % 100 == 0) {
                n = "CD";
            } else if (convertNumber / 10 > 0) {
                n = "XL";
            } else {
                n = "IV";
            }
        } else if (convertNumber % 3 == 0) {
            if (convertNumber % 100 == 0) {
                n = "CCC";
            } else if (convertNumber / 10 > 0) {
                n = "XXX";
            } else {
                n = "III";
            }
        } else if (convertNumber % 2 == 0) {
            if (convertNumber % 100 == 0) {
                n = "CC";
            } else if (convertNumber / 10 > 0) {
                n = "XX";
            } else {
                n = "II";
            }
        }

        return n;
    }


}

