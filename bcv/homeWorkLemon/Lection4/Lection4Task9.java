//Преобразовать строку в массив байтов и обратно.

package com.bcv.homeWorkLemon.Lection4;

import java.util.Arrays;
import java.util.Scanner;

public class Lection4Task9 {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String wordMy = myScanner.nextLine();

        //transform String to byte array
        byte[] byteArr = wordMy.getBytes();
        System.out.println("String to byte array : " + Arrays.toString(byteArr));

        //transform byte array to Sring
        String byteString = new String(byteArr);
        System.out.println("byte array to String : " + byteString);
    }
}
