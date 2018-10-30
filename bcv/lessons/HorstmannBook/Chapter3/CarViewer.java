package com.bcv.lessons.HorstmannBook.Chapter3;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Program for drawing two cars in JFrame
 */

public class CarViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Draw two cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarComponent component = new CarComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}

/**
 * Draw two cars shape
 */

class CarComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Car car1 = new Car(0, 0);
        int x = getWidth() - 60;
        int y = getHeight() - 30;

        Car car2 = new Car(x, y);

        car1.draw(g2);
        car2.draw(g2);
    }
}

/**
 * Create car with position anywhere on the screen
 */

class Car {
    private int xLeft;
    private int yTop;

    /**
     * Constructing a car with a given top left corner.
     *
     * @param x the coordinate of the top-left corner
     * @param y the coordinate of the top-left corner
     */

    public Car(int x, int y) {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draw the car
     */
    public void draw(Graphics2D g2) {
        Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
        Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);
        Point2D.Double r1 = new Point2D.Double(xLeft + 10, yTop + 10);
        Point2D.Double r2 = new Point2D.Double(xLeft + 20, yTop);
        Point2D.Double r3 = new Point2D.Double(xLeft + 40, yTop);
        Point2D.Double r4 = new Point2D.Double(xLeft + 50, yTop + 10);

        Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
        Line2D.Double roofTop = new Line2D.Double(r2, r3);
        Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        g2.draw(frontWindshield);
        g2.draw(roofTop);
        g2.draw(rearWindshield);
    }
}

