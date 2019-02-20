package com.bcv.HorstmannBook.Chapter1;

import javax.swing.*;
import java.util.Scanner;

public class DialoViewerE1_15 {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        String name = aScanner.nextLine();
        JOptionPane.showMessageDialog(null, "Hello, " + name + "! My name is Java! What would you like me to do?");
        System.out.print("Please, enter what would you like me to do: ");
        String meTodo = aScanner.nextLine();
        JOptionPane.showMessageDialog(null, "Sorry! I can't " + meTodo);
    }

}
