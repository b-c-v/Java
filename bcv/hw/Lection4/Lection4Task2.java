/*Вернемся к примеру с точкой плоскости (класс Point).
Реализуем в этом классе ряд методов для работы с точками плоскости.

        1. Расстояние между двумя точками.
        2. Расстояние от данной точки до другой точки.
        3. Расстояние от данной точки до начала координат.
        4. Сдвиг точки по оси X на заданную величину.
        5. Такой же сдвиг по оси Y.
        6. Два метода для получения X- и Y-координаты точки.*/
package com.bcv.hw.Lection4;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Lection4Task2 {


    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Paragraph 2. Enter coordinates (x1,y1; x2,y2): ");
        double x1 = aScanner.nextDouble();
        double y1 = aScanner.nextDouble();
        double x2 = aScanner.nextDouble();
        double y2 = aScanner.nextDouble();

        Paragraph1(x1, y1, x2, y2);
        Paragraph2(x1, y1, x2, y2);
        Paragraph3(x2, y2);
        Paragrahp4(x1, y1, x2, y2);
        Paragrahp5(x1, y1, x2, y2);
        Paragraph6(x1, y1, x2, y2);
    }

    //1. Расстояние между двумя точками.
    static void Paragraph1(double x1, double y1, double x2, double y2) {

        double point = Point2D.distance(0, 0, 10, 10);
        System.out.println("Paragraph 1. Distance between two points is: " + point);

        //without use class Point2D
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance without use of Point2D = " + distance);


    }

    //2. Расстояние от данной точки до другой точки.
    static void Paragraph2(double x1, double y1, double x2, double y2) {
        double point2 = Point2D.distance(x1, y1, x2, y2);
        System.out.println("Distance between your points is: " + point2);
    }

    //3. Расстояние от данной точки до начала координат.
    static void Paragraph3(double x1, double y1) {
        double point3 = Point2D.distance(0, 0, x1, y1);
        System.out.println("Distance between your points and beginning of coordinates is: " + point3);
    }

    //4. Сдвиг точки по оси X на заданную величину.
    static void Paragrahp4(double x1, double y1, double x2, double y2) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Paragraph 4. Enter number for dislocation X: ");
        double xDislocation = aScanner.nextDouble();
        double x1Par4 = x1 + xDislocation;
        double x2Par4 = x2 + xDislocation;
        System.out.println("Old coordinates is: x1 = " + x1 + "; y1 = " + y1 + "; x2 = " + x2 + "; y2 = " + y2);
        System.out.println("New coordinates is: x1 = " + x1Par4 + "; y1 = " + y1 + " x2 = " + x2Par4 + "; y2 = " + y2);
    }

    //5. Сдвиг точки по оси Y на заданную величину.
    static void Paragrahp5(double x1, double y1, double x2, double y2) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Paragraph 5. Enter number for dislocation Y: ");
        double yDislocation = aScanner.nextDouble();
        double y1Par5 = y1 + yDislocation;
        double y2Par5 = y2 + yDislocation;
        System.out.println("Old coordinates is: x1 = " + x1 + "; y1 = " + y1 + "; x2 = " + x2 + "; y2 = " + y2);
        System.out.println("New coordinates is: x1 = " + x1 + "; y1 = " + y1Par5 + " x2 = " + x2 + "; y2 = " + y2Par5);
    }

    //6. Два метода для получения X- и Y-координаты точки.
    static void Paragraph6(double x1, double y1, double x2, double y2) {
        Point2D.Double aPoint1 = new Point2D.Double(x1, y1);
        Point2D.Double aPoint2 = new Point2D.Double(x2, y2);
        System.out.println("Paragraph 6. Coordinates of x is: " + aPoint1.getX());
        System.out.println("Paragrahp 6. Coordinates of y is: " + aPoint2.getY());
    }

}


