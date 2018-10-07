package com.bcv.hw.Lection1;

//Напишите метод, который будет увеличивать заданный элемент массива на 10%.

public class Task6 {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        double a[] = new double [10];
        for (int i = 0; i < a.length; i++) {
            double b =  (i + (i * 0.1));
            System.out.println("If crease " + i + " by 10%. The result is " + b);
        }

    }

}
