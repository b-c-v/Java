package com.bcv.HorstmannBook.Chapter3;

import javax.swing.*;
import java.awt.*;

/**
 * Program for drawing flag of Ukraine
 */

public class FlagUkraine {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(400, 300);
        frame.setTitle("Flag of Ukraine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlagComponent component = new FlagComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}

/**
 * Draw two cars shape
 */

class FlagComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        int w = getWidth();
        int h = getHeight();
        Flag aFlag = new Flag(w, h);


        aFlag.draw(g2);

    }
}

/**
 * Create car with position anywhere on the screen
 */

class Flag {
    private int widthFlag;
    private int heightFlag;

    public Flag(int w, int h) {
        widthFlag = w;
        heightFlag = h;
    }

    /**
     * Draw the flag
     */
    public void draw(Graphics2D g2) {
        Rectangle sky = new Rectangle(0, 0, widthFlag, heightFlag / 2);
        g2.setColor(Color.blue);
        g2.fill(sky);

        Rectangle wheat = new Rectangle(0, heightFlag / 2, widthFlag, heightFlag / 2);
        g2.setColor(Color.yellow);
        g2.fill(wheat);

        g2.draw(wheat);
        g2.draw(sky);
    }
}

