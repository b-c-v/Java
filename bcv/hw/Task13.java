package com.bcv.hw;

/*Напишите программу, которая будет считать количество часов, минут и секунд в n-ном
количестве суток.*/


import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int dayNumber = in.nextInt();
        int hours, minutes, seconds;
        hours = dayNumber * 24;
        minutes = hours * 60;
        seconds = minutes * 60;
        System.out.println("In " + dayNumber + " days are: " + hours + " hours or " + minutes + " minutes or " + seconds + " seconds;");
    }

}
