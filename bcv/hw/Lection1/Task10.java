package com.bcv.hw.Lection1;

//Напишите программу, которая будет просить ввести ваше имя, а потом выведет его на консоль.(*)

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Your name is: " + name);
    }
}
