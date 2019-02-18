package com.bcv.lessons.HorstmannBook.coreJavaVol_1;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery_Listing_3_7 {
    public static void main(String[] args) {

        Scanner aScanner = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw: ");
        int numberDraw = aScanner.nextInt();

        System.out.print("What is the highest number do you need to draw: ");
        int numberHighest = aScanner.nextInt();

        //create array and fill it with numbers from 1 to numberHighest
        int[] numbers = new int[numberHighest];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        //numberDraw put into a second array
        int[] result = new int[numberDraw];

        for (int i = 0; i < result.length; i++) {

            //make a random index between 0 and numberHighest-1
            int random = (int) (Math.random() * numberHighest);


            //pick the element at the random location
            result[i] = numbers[random];


            //move the last element into the random location
            numbers[random] = numbers[numberHighest - 1];
            numberHighest--;

        }

        //print the sorted array
        Arrays.sort(result);
        System.out.println("The combination which make you rich is :");
        for (int random : result)
            System.out.print(random + " ");


    }
}
