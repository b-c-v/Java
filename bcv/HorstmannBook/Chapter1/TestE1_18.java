package com.bcv.HorstmannBook.Chapter1;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TestE1_18 {
    public static void main(String[] args) throws MalformedURLException {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = aScanner.nextLine();
        System.out.print("Please enter title: ");
        String title = aScanner.nextLine();

        URL imagelocation = new URL("http://horstmann.com/java4everyone/duke.gif");
        JOptionPane.showMessageDialog(null, "Hello, "+ name, title,
                 JOptionPane.PLAIN_MESSAGE, new ImageIcon(imagelocation));
    }
}
