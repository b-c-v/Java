/*Разобратся в одном из методов сортировки массива и написать реализацию.
Сортировка пузырьком, выборкой, вставкой.*/

package com.bcv.homeWorkLemon.Lection4;

import java.util.Arrays;

public class Lection4Task6 {
    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            arr[i] = (int) (Math.random() * 100);
//            System.out.print(arr[i] + " ");
        }


        System.out.println("\nSelection Sort");
        long t1 = System.currentTimeMillis();
        selectionSort(arr);
        long t2 = System.currentTimeMillis();
        System.out.println("selection: " + (t2 - t1)); //8500ms if massive length 100_000

        System.out.println("\nBubble Sort");
        long t3 = System.currentTimeMillis();
        bubbleSort(arr);
        long t4 = System.currentTimeMillis();
        System.out.println("bubble: " + (t4 - t3)); //25435ms if massive length 100_000

        System.out.println("\nInto Sort");
        long t5 = System.currentTimeMillis();
        insertSort(arr);
        long t6 = System.currentTimeMillis();
        System.out.println("insert: " + (t6 - t5)); //2352ms if massive length 100_000
    }


    //СОРТИРОВКА ВЫБОРОМ
    public static void selectionSort(int[] arr) {
        // По очереди будем просматривать все подмножества элементов массива (0 - последний, 1-последний, 2-последний,...)
        for (int barrierSelection = 0; barrierSelection < arr.length; barrierSelection++) {
            //Предполагаем, что первый элемент (в каждом подмножестве элементов) является минимальным
            int min = arr[barrierSelection];
            int min_i = barrierSelection;
            // В оставшейся части подмножества ищем элемент, который меньше предположенного минимума
            for (int j = barrierSelection + 1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            // Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами
            if (barrierSelection != min_i) {
                int tmp = arr[barrierSelection];
                arr[barrierSelection] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // СОРТИРОВКА ПУЗЫРЬКОМ
    public static void bubbleSort(int[] arr) {
        // Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл каждый раз ставит в конец фрагмента максимальный элемент
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                // Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //СОРТИРОВКА ВСТАВКОЙ
    private static void insertSort(int[] arr) {


        int newValue;
        for (int i = 1; i < arr.length; i++) {
            newValue = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = newValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}

