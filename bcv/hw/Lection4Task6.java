/*Разобратся в одном из методов сортировки массива и написать реализацию.
Сортировка пузырьком, выборкой, вставкой.*/

package com.bcv.hw;

public class Lection4Task6 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Selection Sort");
        selectionSort(arr);
        System.out.println("");
        System.out.println("Bubble Sort");
        bubbleSort(arr);
        System.out.println("");
        System.out.println("Into Sort");
//        insertSort(arr);
    }


    //СОРТИРОВКА ВЫБОРОМ
    public static void selectionSort(int[] arr) {
        // По очереди будем просматривать все подмножества элементов массива (0 - последний, 1-последний, 2-последний,...)
        for (int i = 0; i < arr.length; i++) {
            //Предполагаем, что первый элемент (в каждом подмножестве элементов) является минимальным
            int min = arr[i];
            int min_i = i;
            // В оставшейся части подмножества ищем элемент, который меньше предположенного минимума
            for (int j = i + 1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            // Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
            System.out.print(arr[i] + " ");
        }
    }

    // СОРТИРОВКА ПУЗЫРЬКОМ
    public static void bubbleSort(int[] arr) {
        // Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл каждый раз ставит в конец фрагмента максимальный элемент
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                // Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }

    }

    //СОРТИРОВКА ВСТАВКОЙ FIND BUGS
/*    private static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            *//* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position *//*
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
            System.out.print(arr[i] + " ");
        }
    }*/
}