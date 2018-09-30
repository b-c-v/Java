//Написать бесконечный цикл для for, while, do while

package com.bcv.hw;

public class Lection4Task3 {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i > 0; i++) {
            System.out.println("For: " + i);
        }
        while (i > 0) {
            i++;
            System.out.println("While: " + i);
        }
        do {
            i++;
            System.out.println("Do While: " + i);
        } while (i > 0);
    }

}
