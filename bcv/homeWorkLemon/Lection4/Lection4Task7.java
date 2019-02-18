/* Напишите метод проверки, является ли строка палиндромом.*/

package com.bcv.homeWorkLemon.Lection4;


import java.util.Scanner;

class Lection4Task7 {

    static class Test {
        public String reverse(String x) {
            String rev = "";
            //x.length - Returns the length of this string
            for (int i = x.length() - 1; i >= 0; i--) {
                rev = rev + x.charAt(i);
            }
            return rev;
        }
    }

    public static void main(String[] a) {
        Test t = new Test();
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = aScanner.next();

        //stolen from internet
        String wordReverse = t.reverse(word);
        //equals - compare strings
        if (word.equals(wordReverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }


        // my Version
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String wordMy = myScanner.nextLine();

        //clear sentence from space and another symbols
        String clear = wordMy.replaceAll("\\s", "");

        //revers clear sentence
        String reverse = new StringBuffer(clear).reverse().toString();

        if (clear.equals(reverse)) {
            System.out.println("Yes, it's palindrome");
        } else {
            System.out.println("It isn't palindrome");

        }
    }

}


