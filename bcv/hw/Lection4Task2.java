/*Вернемся к примеру с точкой плоскости (класс Point).
Реализуем в этом классе ряд методов для работы с точками плоскости.

        1. Расстояние между двумя точками.
        2. Расстояние от данной точки до другой точки.
        3. Расстояние от данной точки до начала координат.
        4. Сдвиг точки по оси X на заданную величину.
        5. Такой же сдвиг по оси Y.
        6. Два метода для получения X- и Y-координаты точки.*/

package com.bcv.hw;


import java.awt.*;
import java.awt.geom.Point2D;//почему если удалить отсюда не видит Point2D
import java.util.Scanner;

public class Lection4Task2 {
    public static void main(String[] args) {
        Paragraph1();
        Paragraph2();
        Paragraph3();
        Paragrahp4();
        Paragrahp5();
        Paragraph6();
    }

    //1. Расстояние между двумя точками.
    static void Paragraph1() {

        double point = Point2D.distance(0, 0, 10, 10);
        System.out.println("Paragraph 1. Distance between two points is: " + point);
    }

    //2. Расстояние от данной точки до другой точки.
    static void Paragraph2() {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Paragraph 2. Enter coordinates (x1,y1; x2,y2): ");
        double x1Point2 = aScanner.nextDouble();
        double y1Point2 = aScanner.nextDouble();
        double x2Point2 = aScanner.nextDouble();
        double y2Point2 = aScanner.nextDouble();

        double point2 = Point2D.distance(x1Point2, y1Point2, x2Point2, y2Point2);
        System.out.println("Distance between your points is: " + point2);
    }

    //3. Расстояние от данной точки до начала координат.
    static void Paragraph3() {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Paragraph 2. Enter coordinates (x,y): ");
        double x1Point3 = aScanner.nextDouble();
        double y1Point3 = aScanner.nextDouble();

        double point3 = Point2D.distance(0, 0, x1Point3, y1Point3);
        System.out.println("Distance between your points is: " + point3);
    }

    //4. Сдвиг точки по оси X на заданную величину.
    static void Paragrahp4() {
        double x1Point4 = 0;
        double y1Point4 = 0;
        double x2Point4 = 10;
        double y2Point4 = 10;
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Paragraph 4. Enter number for dislocation X: ");
        double xDislocation = aScanner.nextDouble();
        double x1Par4 = x1Point4 + xDislocation;
        double x2Par4 = x2Point4 + xDislocation;
        System.out.println("Old coordinates is: x1 = " + x1Point4 + "; y1 = " + y1Point4 + "; x2 = " + x2Point4 + "; y2 = " + y2Point4);
        System.out.println("New coordinates is: x1 = " + x1Par4 + "; y1 = " + y1Point4 + " x2 = " + x2Par4 + "; y2 = " + y2Point4);
    }

    //5. Сдвиг точки по оси Y на заданную величину.
    static void Paragrahp5() {
        double x1Point5 = 0;
        double y1Point5 = 0;
        double x2Point5 = 10;
        double y2Point5 = 10;
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Paragraph 5. Enter number for dislocation Y: ");
        double yDislocation = aScanner.nextDouble();
        double y1Par5 = y1Point5 + yDislocation;
        double y2Par5 = y2Point5 + yDislocation;
        System.out.println("Old coordinates is: x1 = " + x1Point5 + "; y1 = " + y1Point5 + "; x2 = " + x2Point5 + "; y2 = " + y2Point5);
        System.out.println("New coordinates is: x1 = " + x1Point5 + "; y1 = " + y1Par5 + " x2 = " + x2Point5 + "; y2 = " + y2Par5);
    }

    //6. Два метода для получения X- и Y-координаты точки.
    static void Paragraph6() {
        while (true) {
            // Getting the location of x and y coordinate from PointerInfo
            PointerInfo aPointerInfo = MouseInfo.getPointerInfo();
            Point location = aPointerInfo.getLocation();
            System.out.println("x = " + location.getX());
            System.out.println("y = " + location.getY());


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
