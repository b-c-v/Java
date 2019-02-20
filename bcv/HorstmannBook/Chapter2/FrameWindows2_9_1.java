package com.bcv.HorstmannBook.Chapter2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;


public class FrameWindows2_9_1 {
    public static void main(String[] args) {
        //construct an object of the JFrame class
        JFrame aFrame = new JFrame();

        aFrame.setSize(200, 300);
        aFrame.setTitle("An empty frame");
        //when close the frame, the program automatically exit
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //paste inside frame two rectangles
        RectangleComponent aComponent = new RectangleComponent();
        aFrame.add(aComponent);

        //make the frame visible
        aFrame.setVisible(true);


    }

    public static class RectangleComponent extends JComponent {
        public void paintComponent(Graphics g) {

            Graphics2D g2 = (Graphics2D) g;
            //draw eyes with rectangles different coordinates and sizes
            Rectangle box = new Rectangle(55, 20, 20, 30);
            g2.setColor(Color.blue);
            g2.fill(box);
            g2.draw(box);
            box.translate(50, 0);
            g2.setColor(Color.blue);
            g2.fill(box);
            g2.draw(box);
            box.setSize(10, 15);
            box.translate(5, 7);
            g2.setColor(Color.green);
            g2.fill(box);
            g2.draw(box);
            box.translate(-50, 0);
            g2.setColor(Color.green);
            g2.fill(box);
            g2.draw(box);



            //draw nose with ellipse and circle
            Ellipse2D.Double aEllipse = new Ellipse2D.Double(75, 60, 30, 20);
            g2.setColor(Color.pink);
            g2.fill(aEllipse);
            g2.draw(aEllipse);


            Ellipse2D.Double aCircle = new Ellipse2D.Double(85, 65, 10, 10);
            g2.setColor(Color.red);
            g2.fill(aCircle);
            g2.draw(aCircle);

            //draw mouth with lines
            Line2D.Double aLine = new Line2D.Double(70, 90, 110, 90);
            g2.draw(aLine);
            Line2D.Double aSmile = new Line2D.Double(70, 90, 60, 85);
            g2.draw(aSmile);
            Line2D.Double aSmileSecond = new Line2D.Double(110, 90, 120, 85);
            g2.draw(aSmileSecond);

            //print a sentence
            g2.drawString("What do you want?", 45, 120);
        }
    }
}
