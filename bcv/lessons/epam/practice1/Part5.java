package com.bcv.lessons.epam.practice1;
public class Part5 {
    public static void main(String[] args) {
        String[] arr = args[0].split("");
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            m += Integer.parseInt(arr[i]);
        }
        System.out.println(m);
    }
}
