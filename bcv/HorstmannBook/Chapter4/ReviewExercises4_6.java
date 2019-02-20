package com.bcv.HorstmannBook.Chapter4;

/* Modulo % Отбрасываете знак минус. Делите числа как обычно.
А далее, если первое число (делимое), было со знаком минус, к результату добавляете знак минус.*/

public class ReviewExercises4_6 {
    public static void main(String[] args) {
        int a1, a2, a3, a_3, a5, a6, b2, b3, b_3, b_2;
        a2 = 2;
        a3 = 3;
        a_3 = -3;

        b2 = 2;
        b3 = 3;
        b_3 = -3;
        b_2 = -2;

        System.out.println("Math.pow " + a2 + " , " + b3 + " = " + Math.pow(a2, b3) + "\n" +
                "Math.pow " + a3 + " , " + b2 + " = " + Math.pow(a3, b2) + "\n" +
                "Math.pow " + a2 + " , " + b_3 + " = " + Math.pow(a2, b_3) + "\n" +
                "Math.pow " + a3 + " , " + b_2 + " = " + Math.pow(a3, b_2) + "\n" +
                "Math.pow " + a_3 + " , " + b2 + " = " + Math.pow(a_3, b2) + "\n" +
                "Math.pow " + a_3 + " , " + b_2 + " = " + Math.pow(a_3, b_2) + "\n" +

                "Math.max (" + a2 + " , " + b3 + ") = " + Math.max(a2, b3) + "\n" +
                "Math.max " + a3 + " , " + b2 + " = " + Math.max(a3, b2) + "\n" +
                "Math.max " + a2 + " , " + b_3 + " = " + Math.max(a2, b_3) + "\n" +
                "Math.max " + a3 + " , " + b_2 + " = " + Math.max(a3, b_2) + "\n" +
                "Math.max " + a_3 + " , " + b2 + " = " + Math.max(a_3, b2) + "\n" +
                "Math.max " + a_3 + " , " + b_2 + " = " + Math.max(a_3, b_2) + "\n" +

                "Math.floor " + a2 + " , " + b3 + " = " + Math.floorMod(a2, b3) + "\n" +
                "Math.floor " + a3 + " , " + b2 + " = " + Math.floorMod(a3, b2) + "\n" +
                "Math.floor " + a2 + " , " + b_3 + " = " + Math.floorMod(a2, b_3) + "\n" +
                "Math.floor " + a3 + " , " + b_2 + " = " + Math.floorMod(a3, b_2) + "\n" +
                "Math.floor " + a_3 + " , " + b2 + " = " + Math.floorMod(a_3, b2) + "\n" +
                "Math.floor " + a_3 + " , " + b_2 + " = " + Math.floorMod(a_3, b_2) + "\n" +

                a2 + " / " + b3 + " = " + a2 / b3 + "\n" +
                a3 + " / " + b2 + " = " + a3 / b2 + "\n" +
                a2 + " / " + b_3 + " = " + a2 / b_3 + "\n" +
                a3 + " / " + b_2 + " = " + a3 / b_2 + "\n" +
                a_3 + " / " + b2 + " = " + a_3 / b2 + "\n" +
                a_3 + " / " + b_2 + " = " + a_3 / b_2 + "\n" +

                a2 + " % " + b3 + " = " + a2 % b3 + "\n" +
                a3 + " % " + b2 + " = " + a3 % b2 + "\n" +
                a2 + " % " + b_3 + " = " + a2 % b_3 + "\n" +
                a3 + " % " + b_2 + " = " + a3 % b_2 + "\n" +
                a_3 + " % " + b2 + " = " + a_3 % b2 + "\n" +
                a_3 + " % " + b_2 + " = " + a_3 % b_2);

    }
}
