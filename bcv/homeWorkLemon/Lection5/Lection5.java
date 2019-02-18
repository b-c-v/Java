/*создать массив из 10 строк и в каждой строке поменять 3 рандомных символа на три рандомных символа.
Использовать метод indexOf и Random
Алгоритм
1. Создать массив
2. Создать цикл
3. Цикл на 3 прохождения
4. Используя класс Random в диапазоне длины строки получаете int значения
5. Используя таблицу ASCII определить диапазон символов
6. Используя Random в этом дипазоне получить символ
7. Подставить на место 4
*/

package com.bcv.homeWorkLemon.Lection5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lection5 {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Enter a range of array: ");
        int range = aScanner.nextInt();
        System.out.print("Enter number of changes: ");
        int changes = aScanner.nextInt();

        Random aRandom = new Random();
        //create array with dimension of "range"
        char[] array = new char[range];
        //fill the array random characters
        for (int a = 0; a < array.length; a++) {
            int arrayRandom = (char) aRandom.nextInt(26) + 97;
            array[a] = (char) arrayRandom;
        }
        System.out.println("Array before changing: " + Arrays.toString(array));

        //change 3 characters to random characters
        for (int i = 0; i < changes; i++) {
            // range for random numbers ((max - min) + 1) + min
            int letterInt = (char) aRandom.nextInt(26) + 97;
            int ch = changes - 1;
            int a = aRandom.nextInt(ch);
            array[a] = (char) letterInt;
        }
        System.out.println("Array after change:    " + Arrays.toString(array));
    }
}


