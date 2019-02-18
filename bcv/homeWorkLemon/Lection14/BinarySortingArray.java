package com.bcv.homeWorkLemon.Lection14;


import java.util.Scanner;

/**
 * Program create array with random 1000 numbers.
 * Sort numbers with selecting sort method.
 * Then finding number in the array with selection search method.
 */
public class BinarySortingArray {
    public static void main(String[] args) {

//Create array with 1000 random numbers
        int[] arr = new int[1000];
//Fill array with 1000 random numbers from 0 to 1000
        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * 1000); //if want change range Math.random()*range(=max-min+1) + min
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSelection sort: ");
        selectionSort(arr);

        int result = binarySearch(arr, myScanner());
        if (result == -1)
            System.out.println("\nElement not present");
        else
            System.out.println("\nElement found at index: " + result);


    }

    private static void selectionSort(int[] arr) {
        // copy this code from Lection 4 task 6
        for (int barrier = 0; barrier < arr.length; barrier++) {

            int min = arr[barrier];
            int min_i = barrier;

            for (int j = barrier + 1; j < arr.length; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if (barrier != min_i) {
                int tmp = arr[barrier];
                arr[barrier] = arr[min_i];
                arr[min_i] = tmp;
            }
            System.out.print(arr[barrier] + " ");
        }
    }


    // Returns index of x if it is present in arr[], else return -1
    private static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was not present
        return -1;
    }

    //method for input what number to search
    private static int myScanner() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter number from range 0 to 1000, what you want to find: ");
        int findNumber = input.nextInt();
        return findNumber;
    }

}






