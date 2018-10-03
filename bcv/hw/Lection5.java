/*создать массив из 10 строк и в каждой строке поменять 3 рандомных символа на три рандомных символа.
Использовать метод indexOf и Random*/

package com.bcv.hw;

import java.util.Random;

public class Lection5 {
    public static void main(String[] args) {

        int arr[] = new int[10];
        for (int i = 0; i< arr.length; i++)
            arr[i]=  (int)Math.random() ;
        System.out.println();

    }
}
