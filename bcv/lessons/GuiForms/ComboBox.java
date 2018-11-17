package com.bcv.lessons.GuiForms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame {
    private JComboBox comboBox1;
    private JPanel panel1;
    private JButton button;
    private JLabel labelComboBox;


    //constructor
    public ComboBox() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "";

                message += "Button was pressed\n";

                message += "ComboBox " + comboBox1.getSelectedIndex() + "\n";

                JOptionPane.showMessageDialog(null,
                        message,
                        "Output",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });
    }
       /*  createPanel();
        createComboBox();
        createButton();
        setSize(200, 200);

    }

    private void createPanel() {
        JPanel jPanel = new JPanel();
        jPanel.add(comboBox1);
        jPanel.add(button);
        jPanel.add(labelComboBox);
        add(panel1);

    }

    private void createComboBox() {
        comboBox1 = new JComboBox();
    }

    private void createButton() {
        button = new JButton();
    }*/

    public static void main(String[] args) {
        JFrame frame = new JFrame("Name of program");
        frame.setContentPane(new ComboBox().panel1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();


    }
}

