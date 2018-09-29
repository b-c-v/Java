package com.bcv.lessons;

public class CountDigits {
    public static void main(String[] args) {
        int m = 12345678;
        int i = 0;
        while (m > 0) {
            m = m / 10;
            i++;
        }
        System.out.println("i = " + i);
    }

}
