package com.bcv.homeWorkLemon.Lection2;

//Найти наибольший общий делитель числа (НОД)

import java.util.Scanner;

public class SpecialTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = input.nextInt();
        System.out.print("Enter second number: ");
        int y = input.nextInt();

        // защита от ввода 0
        if (x == 0 || y == 0) System.out.println("Наибольший общий делитель чисел " + x + " и " + y + " это 0");

        int z = nod(x, y);
        System.out.print("Наибольший общий делитель чисел " + x + " и " + y + " это " + z);
    }

   static int nod(int x, int y) {
        //защита от ввода отрицательно числа
        if (x < 0) x = x * -1;
        if (y < 0) y = y * -1;
        else
            //поиск НОД алгоритмом Эвклида
            while (x != y) {
                if (x > y) {
                    x = x - y;
                    System.out.println("while if x= " + x);
                } else {
                    y = y - x;
                    System.out.println("while if else y= "+y);
                }
                System.out.println("x = "+x+" y= "+y);
            }
        return x;

    }
}

/*if (x == y) {фк
System.out.println("Numbers are equal");
} else if (x > y && x % y == 0) {
System.out.println("Общий делитель " + y);
} else if (y > x && y % x == 0) {
System.out.println("Общий делитель " + x);
} else if (x % 2 == 0 && y % 2 == 0) {
if (x > y) {
}
} else if (x % y > 1) {
System.out.println("Общий делитель " + "1");
}*/

