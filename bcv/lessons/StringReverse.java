package com.bcv.lessons;
import java.util.Scanner;

/**Program reverse string in two different ways */

public class StringReverse {

    public static void main(String[] args) {


        String str = scannerInput();

        reverseMethod(str);

        charReverse(str);
    }

    public static String scannerInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        return input.nextLine();
    }

    private static void charReverse(String str) {
        char[] array = str.toCharArray();
        System.out.print("charReverse ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);

        }

    }

    private static void reverseMethod(String str) {

        //reverse String with help of reverse method
        String reverse = new StringBuffer(str).reverse().toString();

        System.out.println("reverseMethod " + reverse);
    }

}

