package com.bcv.lessons.HorstmannBook.Chapter7;

import javax.swing.*;

/*Write a program that contains a bounds error*/

public class BoundsErrorR7_3 {
    public static void main(String[] args) {


        int rows = 3;
        int columns = 4;
        int[][] arrayName = new int[rows][columns];


        try {
            System.out.println(arrayName[5][1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sorry! It's out of bounds");
        }
    }
}
